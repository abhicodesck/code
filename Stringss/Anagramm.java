package Stringss;

public class Anagramm {
        public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        s = s.toLowerCase();
        t = t.toLowerCase();

        int[] freq = new int[26];
        for(int i = 0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for (int count : freq) {
            if (count != 0) return false;
        }
        return true;
        
    }
    public static void main(String[] args) {
        boolean s = isAnagram("ABhi","ibha");
        System.out.println(s);
    }
}
