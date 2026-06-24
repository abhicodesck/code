package NumberssNqt;

public class isPrime {
    static boolean Primee(int n){
        if(n<=1) return false;
        int count=0;
    for(int i=2; i*i<=n;i++){
        if(n%i==0) return false;
    }
    return true;
}
public static void main(String[] args) {
    System.out.println(Primee(11));
}
}
