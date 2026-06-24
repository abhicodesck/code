import java.util.*;

public class Segregate0_1 {
    static void Seg(int arr[]) {
        int NumberOfZeros = 0;
        for(int ele : arr) {
            if ( ele == 0) NumberOfZeros++;
        }
        int n = arr.length;
        for(int i = 0 ; i<n; i++){
            if (i<NumberOfZeros) arr[i] = 0;
            else arr[i] = 1;
        }
        System.out.print(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr1 = {1,0,0,0,1};
        Seg(arr1);
    }
}
