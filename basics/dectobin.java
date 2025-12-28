public class dectobin {
    public static void main(String[] args) {
        int n=8;
        int pow = 0;
        int bin = 0;
        int rem = 0;
        while (n!=0) {
           rem=n%2;
           bin=bin+(rem*(int)Math.pow(10, pow));
           pow++;
           n=n/2;
        }
        System.out.println(bin);
    }
}
