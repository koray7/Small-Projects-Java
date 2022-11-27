import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("\n******** Let's play Rock Paper Scissors ********");
        System.out.println("\nWhen I say 'Shoot', Choose: rock, paper, scissors");
        System.out.println("Are you ready? Write 'yes' if you are.");
        String answer = scan.nextLine();

        if(answer.equals("yes")) {
            System.out.println("Great!");
            System.out.println("\nrock - paper - scissors, shoot!");
            
            String userChoice = scan.nextLine();
            String computerChoice = computerChoice();
            String result = result(userChoice, computerChoice);
            printResult(userChoice, computerChoice, result);

        } else {
            System.out.println("Darn, some other time...!");
        }

        scan.close();
    }
        public static String computerChoice(){
        double randomNumber = Math.random() * 3;
        int integer = (int)randomNumber;

        switch(integer) {
            case 0: return "rock!";
            case 1: return "paper";
            case 2: return "scissors";
            default: return "";
        }
    }

        public static String result(String userChoice, String computerChoice) {
            String result = "";

            if(userChoice.equals("rock") && computerChoice.equals("scissors")){
                result = "You win!";
            } else if(userChoice.equals("rock") && computerChoice.equals("paper")) {
                result = "You lose!";
            } else if(userChoice.equals("paper") && computerChoice.equals("rock")) {
                result = "You win!";
            } else if(userChoice.equals("paper") && computerChoice.equals("scissors")) {
                result = "You lose!";
            } else if(userChoice.equals("scissors") && computerChoice.equals("paper")) {
                result = "You win!";
            } else if(userChoice.equals("scissors") && computerChoice.equals("rock")) {
                result = "You lose!";
            } else if (userChoice.equals(computerChoice)) {
                result = "It's a tie!";
            } else {
                System.out.println("INVALID CHOICE");
                System.exit(0);
            }

            return result;
        }

        public static void printResult(String userChoice, String computerChoice, String result) {
            System.out.println("\nYou chose: " + userChoice + "!");
            System.out.println("Computer chose: " + computerChoice + "!");
            System.out.println(result);
        }
}