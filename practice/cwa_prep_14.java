package practice;
import java.util.*;

public class cwa_prep_14 {
    public static void main(String[] args) {

    int[] arr = new int[5];
    int n= arr.length;
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int max = arr[0];
    for(int i = 0; i< n; i++) {
        arr[i] = sc.nextInt();   // taking array input
        sum+=arr[i];             // printing sum of array elements
        if(arr[i]>max) {
            max=arr[i];
        }
    }
    System.out.println(max);
    System.out.println(sum);
    for(int i = 0; i< n; i++) {   // printing array elements
        System.out.print(arr[i]+" ");
    }    
    }
    static void changearr(int y){
        int[] x;
        y = x[];
    }
}
