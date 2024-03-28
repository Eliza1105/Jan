package StreamAPI.Tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestN {
    @Test
    public void test1b() throws IOException {
        // Выбрать мужчин от 20 до 30 лет
        List<Person> mens = Person.persons.stream().filter(p -> p.getAge() >= 20 || p.getAge() <= 30 || p.getSex() == Person.Sex.MAN).collect(Collectors.toList());
        // Найти средний возраст среди мужчин
        double mean = Person.persons.stream().filter(i -> i.getSex() == Person.Sex.MAN).mapToInt(Person::getAge)
                .average().getAsDouble();
        // Найти количество трудоспособных (т.е. от 18 лет и учитывая что женщины выходят в 55 лет, а мужчина в 60)
        long count = Person.persons.stream().filter(i -> i.getAge() >= 18).filter(i -> (i.getSex() == Person.Sex.WOMAN && i.getAge() <= 50) || (i.getSex() == Person.Sex.MAN && i.getAge() <= 60)).count();
        // Найти человека с максимальным возрастом
        Person older = Person.persons.stream().max((p1, p2) -> p1.getAge().compareTo(p2.getAge())).get();
        // Отсортировать по имени в обратном алфавитном порядке
        List<Person> byName = Person.persons.stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).collect(Collectors.toList());
        // Отсортировать сначала по полу, а потом по возрасту
        List<Person> sorted = Person.persons.stream().sorted((p1, p2) -> p1.getSex() != p2.getSex() ? p1.getSex().compareTo(p2.getSex()) : p1.getAge().compareTo(p2.getAge())).collect(Collectors.toList());
        System.out.println(Arrays.toString(sorted.toArray()));
        //Группировка по полу
        Map<Person.Sex, List<Person>> group = Person.persons.stream().collect(Collectors.groupingBy(Person::getSex));
        System.out.println(group.toString());
    }
}
