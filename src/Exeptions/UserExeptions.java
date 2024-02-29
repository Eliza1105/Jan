package Exeptions;
//создание собственных исключений
public class UserExeptions {
    public static void main(String[] args) throws NotEvenExeption, NotCapitalLetterException {
        int a =1;
        if (a%2==1) throw new NotEvenExeption("not even");

        new Person("вася");
    }
}

class NotEvenExeption extends Exception{
    public NotEvenExeption (String s){
       super(s);
    }
}

class Person{
    private String name = "";
    Person(String name) throws NotCapitalLetterException{
        this.name = name;
        validateName();
    }

    private void validateName() throws NotCapitalLetterException{
        if (Character.isLowerCase(name.charAt(0))) {
            throw new NotCapitalLetterException("The first letter of name "+name+ " must be capital");
        }
    }
}

class NotCapitalLetterException extends Exception {
    NotCapitalLetterException(String str) {
        super(str);
    }
}
