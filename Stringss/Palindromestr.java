package Stringss;
public class Palindromestr {
    public static boolean Pal(String s){
    int n = s.length();
    String str="";
    for(int i=s.length()-1; i>=0; i--){
        str+=s.charAt(i);
    }
    if(str.equals(s)) return true;
    else return false;
}
    public static String Pallin(String s){
        String str="";
        for(int i=s.length()-1; i>=0; i--){
        str+=s.charAt(i);
        } 
        if(str.equals(s)) return new String("palindrome");
        else return new String("not palindrome");

    }
    public static void main(String[] args) {
        boolean k = Pal("sas");
        System.out.println(k);
        System.out.println(Pallin("madam"));
    }
}
