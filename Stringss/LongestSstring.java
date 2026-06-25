package Stringss;

import java.util.HashSet;

public class LongestSstring {
    static int LongSubString(String s){
        int right = 0;
        int left = 0;
        int max = 0;
        HashSet<Character> hs = new HashSet<>();
        while(right<s.length()){
            if(!hs.contains(s.charAt(right))){
                hs.add(s.charAt(right));
                max = Math.max(max, right-left+1);
                right++;
            }
            else{
                hs.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(LongSubString("i have a bigger one"));
    }
}
