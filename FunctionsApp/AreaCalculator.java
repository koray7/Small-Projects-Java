import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Which calculator do you want to use?");
        System.out.println("\n1) Area of Square");
        int option = scan.nextInt();

            if(option == 1) {
            System.out.println("Enter a number:");
            double num = scan.nextDouble();
            double result1 = Math.pow(num, 2);
            System.out.println("Square of " + num + " is " + result1);
        }
    }
}