package datatypes;

public class Task5 {
    public static void main(String[] args) {
        int [] arr= {1,3,6,2,0,5};
        int a=3, b=2;
        boolean found1=false, found2= false;
        for (int elem:arr){
            if (elem==a){
                found1=true;
            }
            if (elem==b)
                found2=true;
        }
        if (found1&&found2)
            System.out.println("Sucsess");
        else System.out.println("Fall");
    }

}
