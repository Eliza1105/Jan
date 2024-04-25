package lambda;


  /*  interface Condition {
        boolean isAppropriate(int n);
    }
    public class Lambda {
    private static int sum(int[] numbers, Condition condition) {
        int sum =0;
        for (int i = 0; i<numbers.length; i++)
            if (condition.isAppropriate(numbers[i])){
                sum+=numbers[i];
            }
            return sum;
        }


        public static void main(String[] args) {
            System.out.println(sum(new  int[]{1,-2,3,5},n->n>0));
        }
}   */
        interface Condition {
        boolean isAppropriate(int n);
        }
public class Lambda {
    private static int sum(int[] numbers, Condition condition) {
        int sum =0;
        for (int i=0; i<numbers.length;i++){
            if (condition.isAppropriate(numbers[i])){
                sum+=numbers[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,-5};
        System.out.println(Lambda.sum(arr,x->x>0));
    }
}