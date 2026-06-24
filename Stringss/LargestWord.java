package Stringss;

public class LargestWord {
    public static String LargWord(String s){
        int i = 0;
        String word = "";
        String largest = "";
        for(i=0; i<s.length(); i++){
            if(s.charAt(i)!=' '){
                word+=s.charAt(i);
            }
            else{
                if(word.length()>largest.length()){
                    largest = word;
                }
                word="";
            }
            if(word.length()>largest.length()){
                largest = word;
            }
        }
        return largest;    
    }
    public static void main(String[] args) {
        System.out.println(LargWord("  i have a bigger one"));
    }
}
