public class secondmax {
    public static void main(String[] args) {
        int[] arr = {3,5,52,66,23,22};
        int max = Integer.MIN_VALUE;
        int Smax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]>Smax && arr[i]!=max) Smax= arr[i];
        }
        System.out.println(max);
        System.out.println(Smax);
    }
}
