public class cwh_prep10 {
    public static void main(String[] args) {
        int n = 1;
        int m = 10;
        
        for(int i = n; i<=m; i++) {
        int count = 0;
          for(int j=1; j<=i;j++) {
            if(i%j==0) {
                count++;
            }
        }
         if(count==2){
        System.out.println(i);     
    }
        }
    }
}
