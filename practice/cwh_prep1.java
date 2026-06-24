package practice;
import java.util.*;
public class cwh_prep1 {
    
    public static void main(String[] args) {
        int[] arr = new int[4];
        for(int i=0; i<arr.length; i++){
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }
        for(int arr1 : arr) {
            System.out.print(arr1+" ");
        }
        System.out.println();
        change(arr);
        int i = 0;
        do{
            System.out.print(arr[i]+" ");
            i++;
        } while(i<arr.length);

    }
    public static void change(int[] x) {
        x[2] =99;
    }
}
