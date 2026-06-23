package Stringss;
public class VCS {
    public static void VowConsSp(String s){
        int vowels=0,consonants=0,Spaces=0;
        for(int i = 0; i<=s.length()-1;i++){
            char ch = s.charAt(i);
        if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u') vowels++;
        else if(ch==' ') Spaces++;
        else consonants++;
    }   
        System.out.println("vowels:"+vowels);
        System.out.println("Spaces:"+Spaces);
        System.out.println("Consonants:"+consonants);
}
    public static void main(String[] args) {
        VowConsSp("Abhijeet is a randa");
    }
}