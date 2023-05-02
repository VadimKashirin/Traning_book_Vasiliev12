public class UsingWhile {
    static int decoder(String code){
        int n = code.length();
        int s=0,k=1,q=1,a;
        while (k<=n){
            if (code.charAt(n-k)=='1'){
                a=1;}
            else {
                a=0;
            }
            s = s + q*a;
            q*=2;
            k++;
        }
        return s;
    }
}
