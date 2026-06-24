import java.util.*;

public class arr17_1 {
    public static void arrin(int[] num){
        for(int j=0; j<num.length; j++ ) {
            if(j%2==0){
                num[j] = num[j] + 10;
            }
            else{
                num[j] = 2*num[j];
            }
        }
        for(int num1: num) {
            System.out.print(num1+" ");
        }

    }
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        arrin(arr);

    }
}
