package Stringss;

import java.util.HashSet;

public class FirstReapChar {
    static char firstRc(String s){
        HashSet<Character> hs = new HashSet<>();
        for(int i = 0; i<s.length(); i++){
            if(hs.contains(s.charAt(i))){
                return s.charAt(i);
            }
            hs.add(s.charAt(i));
        }
        return '\0';
    }
    public static void main(String[] args) {
        System.out.println(firstRc("madhuuu"));
    }
}
