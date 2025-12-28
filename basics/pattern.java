
public class pattern {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
        for(int i=0;i<5;i++){
            for(int j=i;j<5;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        char ch='A';
        for(int i=0;i<5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.print("\n");
        }
    }
}
