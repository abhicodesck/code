public class FirstOccurance {
    public static int search(int[] arr,int target){
        int l = 0;
        int n = arr.length;
        int h = n-1;
        int idx=-1;
        while (l<=h) {
            int mid = (l+h)/2;
            if(arr[mid]>target) h = mid-1;
            else if(arr[mid]<target) l = mid+1;
            else{
                idx= mid;
                h=mid-1;
            }
            
        }
        return idx;
    } 

    public static void main(String[] args) {
        int[] arr = {1,4,6,7,22,40};
        System.out.println(search(arr,225));
    }
    
}
