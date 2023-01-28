

public class Prices{
    public static void main(String[] args){
        double[][] restaurant = {
            {12.99, 8.99, 9.99, 10.49, 11.99},
            {0.99, 1.99, 2.49, 1.49, 2.99},
            {8.99, 7.99, 9.49, 9.99, 10.99},
        };

        for (int i = 0; i < restaurant.length; i++) {

            switch (i) {
                case 0: System.out.print("\tHarry: "); break;
                case 1: System.out.print("\tRon: "); break;
                case 2: System.out.print("\tHermione: "); break;
            }

            for (int j = 0; j < restaurant[i].length; j++) {
                System.out.print(restaurant[i][j] + " ");
            }
            System.out.print("\n");
        }

        // for (int k = 0; k < restaurant[0].length; k++){
        //     System.out.print(restaurant[0][k] + " ");
        // }
        // System.out.print("\n");
        // for (int k = 0; k < restaurant[1].length; k++){
        //     System.out.print(restaurant[1][k]+ " ");
        // }
        // System.out.print("\n");
        // for (int k = 0; k < restaurant[2].length; k++) {
        //     System.out.print(restaurant[2][k] + " ");
        // }
        // System.out.println("\n\tBaking: " + Arrays.toString(restaurant[0]));
        // System.out.println("\tBeverage: " + Arrays.toString(restaurant[1]));
        // System.out.println("\tCereals: " +Arrays.toString(restaurant[2]));
    }
}