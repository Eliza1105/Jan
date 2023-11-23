public class Logical {
    public static void main(String[] args) {
        boolean a= false;
        boolean b= false;
        System.out.println(a||b);
        a=true;
        b=false;
        System.out.println(a||b);
        a=true;
        b=true;
        System.out.println(a||b);

//logical AND
         a= false;
         b= false;
        System.out.println(a&&b);
        a=true;
        b=false;
        System.out.println(a&&b);
        a=true;
        b=true;
        System.out.println(a&&b);

        //ligical NOT
        a= false;
        System.out.println(!a);
        a= true;
        System.out.println(!a);
    }
}
