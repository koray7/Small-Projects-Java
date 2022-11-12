public class AppleStore {
    public static void main(String[] args) {
        
        // ############  APPLE STORE COUNT #################

        int numOfApples = 0;
        int numOfCustomers = 0;
        double profit = 0;

        numOfApples += 500;
        double price = 65.40;


// ------ DAY STARTS -------

        numOfApples -= 4;
        numOfCustomers++;
        profit += price*4;

        // System.out.println(numOfApples);
        // System.out.println(numOfCustomers);
        // System.out.println(profit);
        
// ###########################################

        numOfApples -= 20;
        numOfCustomers++;
        profit += price*20;

        // System.out.println(numOfApples);
        // System.out.println(numOfCustomers);
        // System.out.println(profit);

// ##############################################
        numOfApples -= 200;
        numOfCustomers++;
        profit += price*200;

        System.out.println("'" + numOfApples + "' Apple left in the store.");
        System.out.println("'" + numOfCustomers + "' Customer visited the store.");
        System.out.println("'$" + profit + "' dollars made in the store for today. We'll sell more tomorrow!");

    }
}