import java.util.Scanner;
public class CashOrCredit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String option = " ";
        while(true) {
            System.out.println("cash or credit?");
            option = scan.nextLine();
            if(option.equals("cash") || option.equals("credit")) {
                break;
            }
        }
        System.out.println("Thank you for the business!");
    }
}