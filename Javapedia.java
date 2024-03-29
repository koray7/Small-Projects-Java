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
        System.out.println("These are the values you stored: \n ");
        print2DArray(database);
        System.out.print("\nWho do you want information on? ");
        String name = scan.nextLine();
        System.out.print("\n");

        // Function that runs the database and if user input matches with database, it would show the information about that specific data.
        for(int i = 0; i < database.length; i++){
            if(database[i][0].equals(name)) {
                System.out.println("\tName: " + database[i][0]);
                System.out.println("\tDate of birth: " + database[i][1]);
                System.out.println("\tOccupation: " + database[i][2]);
            }
        }
    }
        // Created a function that stores the values and adding space between the information
    public static void print2DArray(String[][] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}