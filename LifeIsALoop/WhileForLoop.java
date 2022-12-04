import java.util.Scanner;
public class WhileForLoop{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String passwords = " ";

        while (!passwords.equals("java")) {
            passwords = scan.nextLine();
            }
            System.out.println("Correct!");
        }
    }