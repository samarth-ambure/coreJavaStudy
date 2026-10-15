public class NestedIf {
    public static void main(String[] args) {
        boolean hasDungeonKey = true;
        int chestCode = 777;

        System.out.println("Approaching the dungeon room...");

        // First (Outer) Check
        if (hasDungeonKey) {
            System.out.println("Door opened! You entered the room.");

            // Second (Inner/Nested) Check
            if (chestCode == 777) {
                System.out.println("Chest unlocked: You found the Golden Sword!");
            } else {
                System.out.println("Wrong code! The chest remains locked.");
            }

        } else {
            System.out.println("The door is locked tight. Find the dungeon key first!");
        }
    }
}
