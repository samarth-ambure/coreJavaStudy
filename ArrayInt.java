import java.util.LinkedList;

public class ArrayInt {
    public static void main(String[] args) {
        // 1. Create a LinkedList of Strings
        LinkedList<String> playerQueue = new LinkedList<>();

        // 2. Add players to the queue
        playerQueue.add("Alice");
        playerQueue.add("Bob");
        playerQueue.add("Charlie");
        System.out.println("Initial queue: " + playerQueue);

        // 3. Fast operations at head and tail (O(1))
        playerQueue.addFirst("VIP_Gamer"); // Jump to the front of the line
        playerQueue.addLast("David");      // Join at the very end
        System.out.println("After VIP and tail additions: " + playerQueue);

        // 4. Inspect head and tail without removing
        System.out.println("Next in line (peek): " + playerQueue.peekFirst());
        System.out.println("Last in line: " + playerQueue.peekLast());

        // 5. Remove from head (FIFO - First In, First Out)
        String servedPlayer = playerQueue.removeFirst();
        System.out.println("Served: " + servedPlayer);
        System.out.println("Queue remaining: " + playerQueue);
    }
}
