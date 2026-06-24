import java.util.*;
public class quesOne {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    boolean is = false;
        
    //String s = "Decimal Binary Fraction Faah Word Hello Drum Fridge Fans Yes Sir Pen";
    int count = 0;
    int count1 = 0;
    for(int i=0 ; i<s.length(); i++){
        if(s.charAt(i) != ' ' &&(i == 0 || s.charAt(i - 1) == ' ')) {
            count++;
            while (s.charAt(i)!=' ') {
                count1++;
            }
        }
    }
    System.out.println(count);
}
}