import java.util.Scanner;


public class ChatBot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Hello. What is your name?");
        String name = scan.nextLine();
        
        System.out.println("Hi " + name + "! I'm Javabot.Where are you from?");
        String city = scan.nextLine();
        
        System.out.println("I hear it's beautiful " + city + "! I'm from a place called Oracle!");
        
        System.out.println("How old are you?");
        int age = scan.nextInt();
        
        System.out.println("\nSo you're " + age + ", cool! I'm 400 years old.");
        System.out.println("This means I'm " + (400/age) + " times older than you.");
        
        System.out.println("Enough about me. What's your favorite language? (Please don't say Python 😅)");
        scan.nextLine();
        String language = scan.nextLine();
        
        System.out.println("\n" + language + ", that's great! Nice chatting with you Dana. I have to log off now. See ya!");
    }
}