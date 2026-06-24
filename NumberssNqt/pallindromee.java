package NumberssNqt;

public class pallindromee {
    static boolean isPallindrome(int n) {
        if(n<0) return false;
        int temp = n;
        int sum=0;
        while(temp!=0){
            int digit = temp%10;
            sum = digit + (sum*10);
            temp = temp/10;
        }
        return sum==n;
    }
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 50;
        System.out.println(isPallindrome(21));
        for(int i = n1; i<=n2; i++){
            if (isPallindrome(i)) {
                System.out.print(i+" ");
            }
            
        }
    }
    
}
