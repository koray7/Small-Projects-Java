public class Pokerito {
    public static void main(String[] args){
        
        int newCard = randomCard();
        System.out.println(newCard);
    }


        public static int randomCard() {
        double randomNum = Math.random() * 13;
        randomNum += 1;
        return (int) randomNum;
    }
}