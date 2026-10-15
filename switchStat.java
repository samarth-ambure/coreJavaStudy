public class switchStat {
    public static void main(String[] args) {
        int choice = 2;

        System.out.println("Selecting hero with slot: " + choice);

        switch (choice) {
            case 1:
                System.out.println("You picked: Warrior! High defense.");
                break;
            case 2:
                System.out.println("You picked: Mage! High magic power.");
                break;
            case 3:
                System.out.println("You picked: Archer! High attack speed.");
                break;
            default:
                System.out.println("Invalid selection! Please pick slot 1, 2, or 3.");
                break;
        }
    }
}
