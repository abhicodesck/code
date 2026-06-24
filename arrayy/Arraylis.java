import java.util.ArrayList;
import java.util.Collections;

public class Arraylis {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(15);
        arr.add(16);
        
        arr.add(17);
        System.out.println(arr);
        arr.set(1,4);
        System.out.println(arr);
        System.out.println(arr.get(1));
        Collections.reverse(arr);
        for(int ele : arr) {
            System.out.print(ele+" ");
        }
    }
}
