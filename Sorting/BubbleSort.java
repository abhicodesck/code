public class BubbleSort {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
        System.out.println();        
    } 
    public static void main(String[] args) {
        int[] arr = {5,34,4,23,-2,0,3};
        int n = arr.length;
        boolean swapped;
        print(arr);
        for(int i = 0; i < n-1 ; i++){
            swapped = false;
            for(int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break; 
        }
    }
}
