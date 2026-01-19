public class VariasiUAS1 {
    public static void main(String[] args) {
        int n = 5;
        int i, j;

        // Output: 01234 -> 0123 -> 012 -> 01 -> 0
        for (i = n; i > 0; i--) {
            for (j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}