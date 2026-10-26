public class NullCheck {
    public static void main(String[] args) {
        String petName = null; // No pet equipped yet!

        System.out.println("Checking active companion...");

        try {
            // Trying to count letters on an empty/null reference
            int nameLength = petName.length();
            System.out.println("Pet name length: " + nameLength);
        } catch (NullPointerException error) {
            System.out.println("Warning: No pet is currently equipped (petName is null)!");
        }

        System.out.println("Inventory screen ready.");
    }
}