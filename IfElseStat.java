public class IfElseStat {
    public static void main(String[] args) {
        int coins = 15;
        int potionPrice = 20;

        System.out.println("Trying to buy a potion for " + potionPrice + " coins...");

        if (coins >= potionPrice) {
            System.out.println("Success! You bought the healing potion! ");
        } else {
            System.out.println("Not enough coins! Go get some coins first. ");
        }
    }
}
