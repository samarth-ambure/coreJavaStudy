

public class AssignmentOperators {
    public static void main(String[] args) {
        int coins = 10;

       
        coins += 5;
        System.out.println("After finding 5 coins (+=): " + coins);

        
        coins -= 3;
        System.out.println("After spending 3 coins (-=): " + coins);

        
        coins *= 2;
        System.out.println("After 2x bonus (*=): " + coins);
    }
}
