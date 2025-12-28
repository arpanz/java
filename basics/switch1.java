import java.util.*;;
public class switch1 {
    public static void main(String args []){
        System.out.println("1.hell door \n2.lucifer wedding \n3.angel's death");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){
            case 1: System.out.println("you fell into lava.BLNT"); break;
            case 2: System.out.println("you are uninvited. Now Please die."); break;
            case 3: System.out.println("You are the suspect. It's okay to not be okay:)"); break;
            default : System.out.println("death");
        }
    }
}
