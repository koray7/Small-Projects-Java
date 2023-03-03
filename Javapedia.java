import java.util.Scanner;
public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("\n*******Javapedia*******");
        System.out.println("How many historical figures will you register?");

        //Users input and creating 2D arrays called "database" with 3 information, depends on users input
        int people = scan.nextInt();
        String[][] database = new String[people][3];
        
        // Running a loop that stores each information on that row
        scan.nextLine();
        for (int i = 0; i < database.length; i++) {
            System.out.println("\n\tFigure: " + (i+1));
            System.out.print("\t -Name: ");
            database[i][0] = scan.nextLine();
            System.out.print("\t -Date of birth: ");
            database[i][1] = scan.nextLine();
            System.out.print("\t -Occupation: ");
            database[i][2] = scan.nextLine();
            System.out.print("\n");
        }
        System.out.println("These are the values you stored: ");
        print2DArray(database);
        System.out.println("\nWho do you want information on? ");
    }
        // Created a function that stores the values
    public static void print2DArray(String[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.print("\n");
        }
    }
}