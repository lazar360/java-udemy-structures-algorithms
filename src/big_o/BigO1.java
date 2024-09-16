package big_o;

public class BigO1 {

    // O(1) : bon
    public static  int addItems(int n){
        return n + n;
    }

    public static void main(String[] args) {
        System.out.println(addItems(1));
    }
}
