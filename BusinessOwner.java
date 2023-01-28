public class BusinessOwner {
    public static void main(String[] args){
        String[][] ingredients = {
            {"Flower", "Water", "Mixer"},
            {"Coke", "Dr. paper", "Sprite"},
            {"Banana", "Chocolate", "Strawberry"},
        };

        for (int i = 0; i < ingredients.length; i++) {

            switch (i) {
                case 0: System.out.println("\nBaking: "); break;
                case 1: System.out.println("Beverage: "); break;
                case 2: System.out.println("Cereals: "); break;
        }

            for (int j = 0; j < ingredients[i].length; j++) {
                System.out.print(ingredients[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}