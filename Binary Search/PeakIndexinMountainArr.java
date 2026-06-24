public class PeakIndexinMountainArr {
public static int peakIndexInMountainArray(int[] arr) {
        int l = 1;
        int h = arr.length - 2;

        while (l <= h) {
            int mid = (l + h) / 2;

            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } 
            else if (arr[mid] < arr[mid + 1] && arr[mid]>arr[mid-1]) {
                l = mid + 1;
            } 
            else {
                h = mid - 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,5,3,1};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
