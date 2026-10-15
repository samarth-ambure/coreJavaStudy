public class elseIfStat {
    public static void main(String[] args) {
        int score = 82;

        System.out.println("Checking player score: " + score);

        if (score >= 90) {
            System.out.println("Rank: A (Outstanding!)");
        } else if (score >= 75) {
            System.out.println("Rank: B (Well done!)");
        } else if (score >= 50) {
            System.out.println("Rank: C (You passed!)");
        } else {
            System.out.println("Rank: D (Need more practice!)");
        }
    }
}
