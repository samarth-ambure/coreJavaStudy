public class NumberFormat {
    public static void main(String[] args) {
        String userInput = "abc"; // Pretend a player typed this in a text box

        System.out.println("Processing player level...");

        try {
            // Integer.parseInt converts text to an int, but 'abc' isn't a number!
            int level = Integer.parseInt(userInput);
            System.out.println("Player level set to: " + level);
        } catch (NumberFormatException error) {
            System.out.println("Invalid input! '" + userInput + "' is not a valid number.");
            System.out.println("Defaulting player level to 1.");
        }

        System.out.println("Game menu loaded successfully!");
    }
}
