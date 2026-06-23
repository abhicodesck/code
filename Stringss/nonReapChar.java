package Stringss;

import java.util.HashMap;

public class nonReapChar {
    static char FirstNRC(String s){
       HashMap<Character,Integer> hm = new HashMap<>();
       for(int i =0; i<s.length(); i++){
        char ch = s.charAt(i);
        if(hm.containsKey(ch)){
           hm.put(ch,hm.get(ch)+1);
        }
        else  hm.put(ch,1);
       }
       for(int i=0; i<s.length();i++){
        if(hm.get(s.charAt(i))==1){
            return s.charAt(i);
        }
       }
       return '\0';

    } 
        public static void main(String[] args) {
            System.out.println(FirstNRC("swiss"));
        }       
    } 

