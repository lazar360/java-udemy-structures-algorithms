package big_o;

public class BigODropConstants {

    public static void main(String[] args) {
        printItems(10);
    }

    private static void printItems(int n) {
        // O(2n) -> O(n)
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        for (int j = 0; j < n; j++) {
            System.out.println(j);
        }
    }
}
