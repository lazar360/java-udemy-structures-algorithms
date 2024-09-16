package big_o;

public class BigODropNonDominant {

    public static void printItems(int n) {
        // n * n = n² O(n²) : pas bon
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }

        // O(n)
        for (int k = 0; k < n; k++) {
            System.out.println(k);
        }

        // O(n² + n) -> O(n²)
    }
    public static void main(String[] args) {
        printItems(10);
    }

}
