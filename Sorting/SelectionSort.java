public class SelectionSort {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
        System.out.println();        
    } 
    public static void main(String[] args) {
        int[] arr = {2,4,0,-3,-1,5,3,55,5};
        int n = arr.length;
        print(arr);
        for(int i=0; i<n; i++){
            int min = Integer.MAX_VALUE;
            int midx = 0;
            for(int j=i; j<n;j++){
                if(arr[j]<min){
                    min = arr[j];
                    midx=j;
                }
            }
            int temp= arr[i];
            arr[i]=arr[midx];
            arr[midx] = temp;            
        }
        print(arr);
    }
    
}
