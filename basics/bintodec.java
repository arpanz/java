
public class bintodec {
    public static void main(String[] args) {
        int n=101010;
        int ld=0;
        int pow=0;
        int dec=0;
        while (n!=0){
            ld=n%10;
            dec=dec+(ld*(int)Math.pow(2,pow));
            pow++;
            n=n/10;
        }
        System.out.println(dec);
    }
    
}