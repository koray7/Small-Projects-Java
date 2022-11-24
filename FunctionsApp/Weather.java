import java.util.Scanner;
public class Weather {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("What's the weather in fahrenheit?");
        double input = scan.nextDouble();
        System.out.println("Weather in celsius " + (input - 32) * 5/9);
    }

    public static double convert(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}