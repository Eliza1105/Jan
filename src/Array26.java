public class Array26 {
    public static void main(String[] args) {
        /*Дан целочисленный массив размера N. Проверить, чередуются ли в
        нем четные и нечетные числа. Если чередуются, то вывести 0, если нет,
         то вывести порядковый номер первого элемента, нарушающего закономерность
         */
    int[] arr= {3,3,4,1,6,5,8,10};
    boolean curr, prev=arr[0]%2==0?true:false;
    int index=0;
    for (int i=1; i< arr.length; i++){
       // if (arr[i]%2==0) curr=true;
        curr=arr[i]%2==0?true:false;
        if (prev==curr){
            index=i;
            break;
        }
        prev=curr;
    }
        System.out.println(index);
}

}