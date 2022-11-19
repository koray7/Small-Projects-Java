import java.util.Scanner;


public class Quiz {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int totalPoint = 0;

        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy");
        String country = scan.nextLine();

        if(country.equals("c")){
            totalPoint += 5;
        }
    
        System.out.println("2. Which planet is the hottest?");
        System.out.println("\n\ta) Venus \n\tb) Saturn \n\tc) Mercury \n\td) Mars");
        String planet = scan.nextLine();

        if(planet.equals("a")) {
            totalPoint += 5;
        }

        System.out.println("3. What is the rarest blood type?");
        System.out.println("\ta) 0 \n\tb) A \n\tc) B \n\td AB-Negative");
        String blood = scan.nextLine();

        if(blood.equals("d")) {
            totalPoint += 5;
        }

        System.out.println("4. Which one these character is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley \n\tb) Hermione Granger \n\tc) Draco Malfoy");
        String friend = scan.nextLine();

        if(friend.equals("a")) {
            totalPoint += 5;
        }

        if(totalPoint >= 15) {
            System.out.println("Wow! You know your stuff.");
        } else if (totalPoint >= 5 && totalPoint < 15) {
            System.out.println("Not bad!");
        } else {
            System.out.println("Better luck next time!");
        }

        System.out.println("Your final score is " + totalPoint + "/20");
    }
}