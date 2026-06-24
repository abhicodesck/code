public class BinarySearch {
    public static int search(int[] arr,int target) {
        int n = arr.length;
        int l = 0;
        int h = n-1;
        while(l<=h){
            int mid =(l+h)/2;
            if(arr[mid]<target) l = mid+1;
            else if(arr[mid]>target) h = mid-1;
            else return mid;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,23,44,55,66};
        System.out.println(search(arr,44));
    }
    
}
