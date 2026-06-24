import java.util.*;
public class hrank_4 {    
   public static void main(String[] args) {

    int[] arr = new int[5];
    Scanner sc = new Scanner(System.in);
    for(int i = 0; i<arr.length; i++){
        arr[i] = sc.nextInt();
    }        
    for(int arr1: arr) {
        System.out.print(arr1+" ");
    }
    System.out.println();
    change(arr);
    for(int arr1: arr) {
        System.out.print(arr1+" ");
    }
    }
    public static void change(int[] x) {
        x[2] =7;
    }
    
    }

