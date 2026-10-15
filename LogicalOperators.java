

public class LogicalOperators {
    public static void main(String[] args) {
        boolean hasShoes = true;
        boolean hasId = false;

        // Both must be true
        System.out.println("Allowed with AND (&&): " + (hasShoes && hasId));

        // At least one must be true
        System.out.println("Allowed with OR (||):  " + (hasShoes || hasId));

        // Opposite day (!)
        System.out.println("Opposite with NOT (!): " + (!hasShoes));
    }
}
