package Stringss;
import java.util.*;

public class ReverseStr {
    static String reverse(String s){
        char[] arr = s.toCharArray();
        int l = 0;
        int h = arr.length-1;
        char temp;
        while(l<h){
            temp = arr[l];
            arr[l] = arr [h];
            arr[h] = temp;
            l++;
            h--;
        }
        return new String(arr);

    }
    static String rev1(String s){
        StringBuilder s1 = new StringBuilder();
        int l = 0;
        int h = s.length()-1;
        char temp;
        while(l<=h){
            temp = s.charAt(h);
            s1.append(temp);
            h--;
        }
        return new String(s1);
    }
    public static void main(String[] args) {
        String s = reverse("abhi");
        String s2 = rev1("string");
        System.out.println(s);
        System.out.println(s2);
    }
}
