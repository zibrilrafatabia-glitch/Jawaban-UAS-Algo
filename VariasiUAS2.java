public class VariasiUAS2 {
    public static void main(String[] args) {
        int n = 5;
        int i, j;

        // Output: 0 -> 11 -> 222 -> 3333 -> 44444
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(i); // Yang dicetak adalah nilai i
            }
            System.out.println();
        }
    }
}