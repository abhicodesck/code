public class cwh_prep3 {
    static int getSum(int n) {
        if(n==0)
          return n;

        return n + getSum(n-1);
    }
    public static void main(String[] args) {
   /*      int n = 5;
        int sum = 0 ;
        for(int i = 0 ;i<=n;i++){
            sum = sum+i;
        }
        System.out.println(sum+" sum of first "+ n+" numbers");  */
        int n =5;
        int sum = getSum(n);
        System.out.println(sum);
    }
}
