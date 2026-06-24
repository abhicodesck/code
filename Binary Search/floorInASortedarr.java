public class floorInASortedarr {
    public static int findFloor(int[] arr,int x) {
        int l = 0;
        int h = arr.length-1;
        int flr=-1;
        while(l<=h) {
            int mid = (l+h)/2;
            if(arr[mid]>x) h=mid-1;
            else {
                flr=mid;
                l=mid+1;
            }
        }
        return flr;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,10};
        System.out.println(findFloor(arr, 8));
    }
}
