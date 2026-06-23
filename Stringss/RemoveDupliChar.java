package Stringss;

import java.util.HashSet;

public class RemoveDupliChar {
    static String removeChar(String s){
        HashSet<Character> hs = new HashSet<>();
        for(int i = 0; i<s.length(); i++){
            hs.add(s.charAt(i));
        }
        String str = "";
        for(char ch:hs){
            str+=ch;
        }
        return str;
    }
    public static void main(String[] args) {
        System.out.println(removeChar("implement"));
    }
}
