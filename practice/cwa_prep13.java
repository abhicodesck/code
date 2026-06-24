package practice;
public class cwa_prep13 {
    static void pat1(int n) {
        for (int i = 1; i <= n ; i++){
            int s;
            for(s=i;s<=n;s++){
                System.out.print(" ");
            }
            for(int j=1; j<= 2*i-1; j++) {
                if (i==1 || j==1 || i==n || j==2*i-1 ) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pat1(5);
    } 
}
