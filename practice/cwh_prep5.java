public class cwh_prep5 {
    static int getRsum(int x,int n) {
        if(x>n)
        return 0;
        return x + getRsum(x+1,n);
    }
    public static void main(String[] args) {
       /* int x = 12;
        int n = 15;
        int sum = 0;
        for(int i= x; i<=n; i++) {
            sum=sum+i;
        }
        System.out.println("sum = "+ sum);*/ 
        int sum = getRsum(5, 10);
        System.out.println(sum);
    }
}
