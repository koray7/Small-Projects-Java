public class TipCalculator {
    public static void main(String[] args){
        tipTheWaiter(85);
    }
    public static void tipTheWaiter(double bill) {
    double tipCalculated = bill*0.15;
    System.out.println("Thank you! Your service was wonderful! Please, accept this tip: " + tipCalculated);
    }
}