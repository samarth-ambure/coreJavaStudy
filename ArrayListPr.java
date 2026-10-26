import java.util.ArrayList;


public class ArrayListPr {
    public static void main(String[] args) {
        // 2. Create an ArrayList that holds Strings
        ArrayList<String> bag = new ArrayList<>();

        System.out.println("--- Adding items to expandable bag ---");
        // Add items (.add)
        bag.add("Iron Sword");
        bag.add("Health Potion");
        bag.add("Shield");
        bag.add("Fire Scroll"); // Automatically expands to fit 4 items!

        // Total count (.size() instead of .length)
        System.out.println("Total items in bag: " + bag.size());

        // Read an item (.get(index) instead of bag[index])
        System.out.println("First item: " + bag.get(0));

        // Remove an item (.remove)
        System.out.println("\nUsing Health Potion...");
        bag.remove("Health Potion"); // Or bag.remove(1)

        System.out.println("Total items left: " + bag.size());

        // Check the remaining items
        System.out.println("\nRemaining backpack contents:");
        for (String item : bag) {
            System.out.println("- " + item);
        }
    }

}
