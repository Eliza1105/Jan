public class Task5_90 {
    public static void main(String[] args) {
        int  n=10; //найти 5!=1*2*3*4*5
        double sum=1, a=1.;
        for(int i=0; i<n-1;i++){
            a*=(i+1);
            sum+=1./a;
        }
        System.out.println(sum);
        //int fact=1,
        // for (int i=1; i<=n; i++)
        // fact*=i;
        // System.out.println(fact);

    }
}
