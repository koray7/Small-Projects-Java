public class IfElse {
    public static void main(String[] args){
        int grade = 65;

        if (grade > 50) {
            System.out.println("Great job, you passed!");
        } else {
            System.out.println("Study hard next time!");
        }

        double wallet = 100;
        double toyCar = 5.99;

        System.out.println("\nCan you buy me this?");

        if (wallet > toyCar) {
            System.out.println("-Sure!");
        } else {
            System.out.println("Sorry, I only have " + wallet + " left");
        }
        wallet -= toyCar;
        // System.out.println(wallet);

        double nike = 95.99;
        System.out.println("\nCan I get these nike shoes?");
        if (wallet > nike) {
            System.out.println("Sure!");
        } else {
            System.out.println("Sorry, there is not enough money left!");
        }
    }
}