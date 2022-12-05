import java.util.Scanner;

public class WhileForLoop{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // String passwords = " ";

        // while (!passwords.equals("java")) {
        //     passwords = scan.nextLine();
        //     }
        //     System.out.println("Correct!");

        // ********************** 


        // System.out.println("I chose a number between 1 and 5, try to guess it: ");
        // int secret = 4;
        // int guess = scan.nextInt();

        // while (guess != secret) {
        //     System.out.println("Guess Again: ");
        //     guess = scan.nextInt();
        // }
        //     System.out.println("You're right about that!");

        // ****************************

        System.out.println("\nWelcome to Javagram! Sign in below");
        System.out.println("-Username: ");
        String user = scan.nextLine();
        System.out.println("-Password: ");
        String pass = scan.nextLine();
        
        
        String username = "koray";
        String password = "java<3";

        while (!user.equals(username) || !pass.equals(password)) {
        
            System.out.println("\nIncorrect information, please try again.");
            System.out.print("- Username: ");
            user = scan.nextLine();
            System.out.print("- Password: ");
            pass = scan.nextLine();
        }
        System.out.println("Signed in successfully. WELCOME!");
        
        scan.close();
        }
    }