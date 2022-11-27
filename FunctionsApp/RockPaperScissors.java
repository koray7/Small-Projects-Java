import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("\n******** Let's play Rock Paper Scissors ********");
        System.out.println("\nWhen I say 'Shoot', Choose: rock, paper, scissors");
        System.out.println("Are you ready? Write 'yes' if you are.");
        String answer = scan.next();

        if(answer.equals("yes")) {
            System.out.println("Great!");
            System.out.println("Rock - Paper - Scissors, shoot!");
            String userChoice = scan.next();
        } else {
            System.out.println("Darn, some other time...!");
        }
        
        int pcChoice = computerChoice();
        
        if(pcChoice < 1) {
            System.out.println("Rock!");
        } else if(pcChoice >= 1 && pcChoice <= 2) {
            System.out.println("Paper");
        } else if (pcChoice >= 2) {
            System.out.println("Scissors");
        }
    }
        public static int computerChoice(){
        double randomNumber = Math.random() * 3;
        return (int)(randomNumber);
    }
}