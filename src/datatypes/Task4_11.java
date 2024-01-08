package datatypes;

public class Task4_11 {
    public static void main(String[] args) {
        int[] arr={2,7,3,11,3,7,2};
        //System.out.println(isPrime(15));
        // System.out.println(allArePrime(arr));
        // System.out.println(isSymmetric(arr));
        System.out.println(allIsPrime(arr)&&isSymmetric(arr));
    }
    static boolean isPrime(int n) {
        boolean flag = true;
        for (int i = 2; i <=Math.sqrt(n); i++)
            if (n % i == 0)
                flag = false;
            return flag;

    }
    static boolean allIsPrime (int [] arr){
       // for (int i=0; i< arr.length; i++);
        for (int n:arr)
            if (!isPrime(n)) return false;
        return true;
    }
    static boolean isSymmetric(int [] arr){
        for (int i=0; i< arr.length/2; i++)
            if (arr[i]!=arr[arr.length-1-i])
                return  false;
        return true;
    }
}
