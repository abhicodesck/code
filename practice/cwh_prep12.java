public class cwh_prep12 {
    static void pattern(int n) {
        for(int i=1; i<=n; i++){
           for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int j=i; j<=2*n-i; j++){
                if((j==i || j==2*n-i || i==1)){
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
        pattern(4);
    }
}
