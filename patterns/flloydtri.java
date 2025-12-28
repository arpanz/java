public class flloydtri {
    public static void main(String[] args) {
        int n=5;
        int counter=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                counter++;
                System.out.print(counter);
            }
            System.out.println();
        }
    }
}

