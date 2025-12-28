public class reverse {
    public static void main(String[] args) {
        int n = 31004;
        int a;
        while (n>0) {
            a=n%10;
            System.out.print(a);
            n=n/10;
        }
    }
}
