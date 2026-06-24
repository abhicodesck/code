public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {5,6,32,5,3,25};
        int i=0;
        int n = arr.length;
        int j=n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int arr1 : arr) {
            System.out.print(arr1+" ");
        }

    }
}
