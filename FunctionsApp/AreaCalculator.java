import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Which calculator do you want to use?");
        System.out.println("\nPress '1' for Area of Square");
        System.out.println("Press '2' for Area of Rectangle");
        int option = scan.nextInt();

            if(option == 1) {
                System.out.println("Enter the side of the square:");
                double num = scan.nextDouble();
                double result = Math.pow(num, 2);
                System.out.println("Square of " + num + " is " + result);
            }else if (option == 2){
                System.out.println("Enter the 'length' and 'width' of Rectangle in same line:");
                double length = scan.nextDouble();
                double width = scan.nextDouble();
                double result = length*width;
                System.out.println("Are of Rectangle is " + result);
        }
    }
}