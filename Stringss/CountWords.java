package Stringss;

public class CountWords {
    public static int Count(String s){
        int count=0;
        for(int i= 0; i<s.length();i++){
            if(s.charAt(i)!=' ' && (i==0 || s.charAt(i-1)==' ')){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(Count("i love you"));
    }
}
