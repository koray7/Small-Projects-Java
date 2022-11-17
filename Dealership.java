import java.util.Scanner;

public class Dealership {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Java dealership!");
        System.out.println(" - Select option 'a' to buy a car");
        System.out.println(" - Select option 'b' to sell a car");
        String option = scan.nextLine();

        switch (option) {
            case "a": 
                System.out.println("What is you budget?");
                int budget = scan.nextInt();
                if (budget >= 10000) {
                System.out.println("Great! A Mercedes Amg is available.");
                System.out.println("\nDo you have insurance? Write 'Yes' or 'No'");
                scan.nextLine();
                String insurance = scan.nextLine();
                System.out.println("Do you have an driver license 'Yes' or 'No'");
                String license = scan.nextLine();
                
                } else {
                System.out.println("We don't sell cars under 10000");
                }
                break;
                System.out.println("You chose option " + option); break;
            
            case "b": 
            System.out.println("You chose option " + option); break;
            default: System.out.println("invalid option"); break;
        }
        // scan.break();
    }
}