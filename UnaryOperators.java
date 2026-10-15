
public class UnaryOperators {
    public static void main(String[] args) {
        int lives = 3;

        // Player picks up an extra heart
        lives++; 
        System.out.println("Lives after 1up (++): " + lives);

        // Player hits a trap
        lives--; 
        System.out.println("Lives after damage (--): " + lives);
    }
}
