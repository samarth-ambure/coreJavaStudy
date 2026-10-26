public class MultiExceptions {
    public static void main(String[] args) {
        String[] scores = {"100", "200", "zero"};

        System.out.println("Calculating average score...\n");

        try {
            // Trap 1: Accessing a slot that might not exist
            String selectedScore = scores[2]; // Change to scores[5] to trigger Trap 1!

            // Trap 2: Converting text that isn't a number
            int scoreValue = Integer.parseInt(selectedScore);

            // Trap 3: Dividing by zero
            int result = scoreValue / 0;
            System.out.println("Result: " + result);

        } catch (ArrayIndexOutOfBoundsException error) {
            System.out.println("[Handled] Error: Requested slot does not exist in the array!");
        } catch (NumberFormatException error) {
            System.out.println("[Handled] Error: The text could not be converted to a number!");
        } catch (ArithmeticException error) {
            System.out.println("[Handled] Error: Math calculation tried to divide by zero!");
        }

        System.out.println("\nLeaderboard calculation finished safely!");
    }
}
