package Recursion;

public class decrease_1_to_5 {
    static void main() {
        int n = 5;
        pd (n);
    }

    public static void pd(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        pd(n - 1);
    }
}
