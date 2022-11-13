import java.util.Scanner;


public class SurveyApp {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome! Thank you for taking the survey.");

        int counter = 0;
        System.out.println("\nWhat is your name?");
        String name = scan.nextLine();
        counter++;

        System.out.println("\nHow much money do you spend on coffee?");
        double coffeePrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow much money do you spend on fast food?");
        double foodPrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow many times a week do you buy coffee?");
        int coffeeAmount = scan.nextInt();
        counter++;

        System.out.println("\nHow many times a week do you buy fast food?");
        int foodAmount = scan.nextInt();
        counter++;


        System.out.println("\nThank you '" + name + "' for answering '" + counter + "' questions!");

        String rounded = String.format("%.02f", (foodPrice/coffeePrice));
        System.out.println("\nYour fast food expenses are '" + rounded + "' times more than your coffee expenses.");

        System.out.println("You spend $" + (coffeeAmount*coffeePrice) + " on coffee by weekly.");
        scan.close();

        System.out.println("You spend $" + (foodAmount*foodPrice) + " on food by weekly.");
    }
}