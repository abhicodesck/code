package Stringss;
import java.util.*;

public class CapitalFirst {
    public static String Capitalize(String s){
        String s1 = "";
        for(int i= 0; i<s.length();i++){
            if(s.charAt(i)!=' ' && (s.charAt(i-1)==' ' || i==0)){
                s1+=Character.toUpperCase(s.charAt(i));
            }
            else{
                s1+=s.charAt(i);
            }
        }
        return s1.replaceAll("\\s+","");
    }
    public static void main(String[] args) {
        System.out.println(Capitalize("  I have a bigger one"));
    }
}
