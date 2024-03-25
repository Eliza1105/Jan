package StreamAPI.Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ControlTest {
    @Test
    public void test1a() throws IOException {
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1", "b1");
        // Проверить первый элемент коллекции,
        String first = collection.stream().findFirst().orElse(null);
        // последний элемент коллекции,
        String last = collection.stream().skip(collection.size()-1).findAny().orElse(null);
        // число элементов,
        long count = collection.stream().count();
        // проверить, существует ли элемент
        String find = collection.stream().filter("a3"::equals)
                .findFirst().get();
        //Выбрать элемент по шаблону regex, чтобы строка начиналась на 'b'
        List<String> selected = collection.stream().filter(s -> Pattern.compile("/^b/").matcher(s).matches()).collect(Collectors.toList());
        Assertions.assertAll("",
                () -> Assertions.assertEquals(first, "a1"),
                () -> Assertions.assertEquals(first, "a1")
        );

    }

    @Test
    public void test1b() throws IOException {
        // Выбрать мужчин от 20 до 30 лет
        List<Person> mens = Person.persons.stream().filter(p-> p.getAge()>=20|| p.getAge()<=30||p.getSex()==Person.Sex.MAN).collect(Collectors.toList());
        // Найти средний возраст среди мужчин
        double mean = Person.persons.stream().filter(i->i.getSex()==Person.Sex.MAN).mapToInt(Person::getAge)
                .average().getAsDouble();
        // Найти количество трудоспособных (т.е. от 18 лет и учитывая что женщины выходят в 55 лет, а мужчина в 60)
        long count = Person.persons.stream().filter(i-> i.getAge()>=18).filter(i->(i.getSex()==Person.Sex.WOMAN&&i.getAge()<=50)||(i.getSex()== Person.Sex.MAN&&i.getAge()<=60)).count();
        // Найти человека с максимальным возрастом
        Person older = Person.persons.stream().max((p1,p2)->p1.getAge().compareTo(p2.getAge())).get();
        // Отсортировать по имени в обратном алфавитном порядке
        List<Person> byName = Person.persons.stream().sorted((p1,p2)->p1.getName().compareTo(p2.getName())).collect(Collectors.toList());
        // Отсортировать сначала по полу, а потом по возрасту
        List<Person> sorted = Person.persons.stream().sorted((p1,p2)->p1.getSex()!=p2.getSex()?p1.getSex().compareTo(p2.getSex()):p1.getAge().compareTo(p2.getAge())).collect(Collectors.toList());
        System.out.println(Arrays.toString(sorted.toArray()));
        //Группировка по полу
        Map<Person.Sex, List<Person>> group = Person.persons.stream().collect(Collectors.groupingBy(Person::getSex));
        System.out.println(group.toString());
    }


    @Test
    public void test1() throws IOException {
        try {
            //Используя stream, записать в файл последовательность строк "a1,b2,c3,d4...z26"
            File file = new File("src/StreamAPI/Tests/data.txt");
            PrintWriter out = new PrintWriter(file);
            IntStream.rangeClosed(1, 26).mapToObj(i -> new StringBuilder()
                            .append(Character.toString(i + 'a' - 1))
                            .append(Integer.toString(i)).toString())
                    .forEach(out::println);
            out.close();
            //Прочитать данные из файла. Проверить первую и последнюю записанные строки
            List<String> strings = Files.lines(Paths.get("src/StreamAPI/Tests/data.txt"))
                    .collect(Collectors.toList());

            Assertions.assertAll("executable instance check",
                    () -> Assertions.assertEquals(strings.get(0), "a1"),
                    () -> Assertions.assertEquals(strings.get(strings.size() - 1), "z26")
            );
        } catch (FileNotFoundException e){
            System.out.println("Ошибка, файл не найден.");

        }catch (IOException e){
            System.out.println("Ошибка при вводе/выводе данных из файла.");
        }
    }
    @Test
    public void test2() {
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");
        // Получить все числа подряд, записать в массив целых чисел
        int[] numbers = collection.stream()
                .mapToInt(s->Integer.parseInt(s.substring(1)))
                .toArray();
        // Получить все числа подряд, записать в массив строк
        collection = Arrays.asList("1,2,0","4,5");
        String[] strings = collection.stream()
                .flatMap(s->Arrays.asList(s.split(",")).stream())
                .toArray(String[]::new);
        //Найти сумму всех чисел, которые хранятся через запятую в collection
        collection = Arrays.asList("1,2,0","4,5","1,2");
      int sum = collection.stream()
              .flatMapToInt(s->Arrays.asList(s.split(",")).stream()
                      .mapToInt(Integer::parseInt))
              .sum();
    }
}
 class Person {

    public static enum Sex {
        MAN,
        WOMAN
    }

    private final String name;
    private final Integer age;
    private final Sex sex;

    public static List<Person> persons = new ArrayList<>(
            (Arrays.asList(new Person("Alice", 25, Sex.WOMAN),
                    new Person("Bob", 30,
                            Sex.MAN
                    ),
                    new Person("Charlie", 35,
                            Sex.MAN
                    ),
                    new Person("Basil", 16,
                            Sex.MAN
                    ),
                    new Person("Peter", 23,
                            Sex.MAN
                    ),
                    new Person("Elen", 42, Sex.WOMAN),
                    new Person("John", 69,
                            Sex.MAN
                    )
            )));

    public Person(String name, Integer age, Sex sex) {

        this.name
                = name;
        this.age = age;

        this.sex
                = sex;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}