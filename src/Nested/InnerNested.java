package Nested;
/*
В Java существуют 4 типа вложенных (nested) классов:
1.Статические вложенные классы
2.Внутренние классы
3.Локальные классы
4.Анонимные (безымянные) классы
 */
public class InnerNested {
    public static void main(String[] args) {
Person slava = new Person("Slava");
slava.addAccount("qwertyui");

Math2.Factorial factorial = Math2.getFactorial(6);
        System.out.println(factorial.getResult());
    }
}

class Person {
    private String name;

    Person(String name) {

        this.name = name;
    }

    public void addAccount(String password) {
        class Account {
            void display() {
                System.out.printf("Account Login: %s \t Password: %s \n", name, password);
            }
        }
        Account account = new Account();
        account.display();
    }
}

    //Статический вложенный класс
    class Math2{
        public static class Factorial{
            private int result;
            private int key;
            public Factorial(int result, int key){
                this.result=result;
                this.key = key;
            }
            public int getResult(){
                return result;
            }
            public int getKey(){
                return key;
            }
        }
        public static Factorial getFactorial(int key){
            int result=1;
            for (int i = 1; i <= key; i++)
                result *= i;
            return new Factorial(result, key);
        }
    }