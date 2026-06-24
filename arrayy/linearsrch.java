public class linearsrch {
    public static void main(String[] args) {
        int[] arr = {2,5,3,23,12,3};
        int target=12;
        boolean flag = false;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==target) {
                flag = true;
                break;
            }
        }
        if(flag) System.out.println("target is in the array");
        else System.out.println("target is not in the array");

    }
}
