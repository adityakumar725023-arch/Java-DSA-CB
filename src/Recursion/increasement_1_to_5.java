package Recursion;

public class increasement_1_to_5 {
    static void main() {
        int n=5;
        pi(n);
    }
    public static void pi(int n) {
        if (n == 0) {
            return;
        }
            System.out.println(n);
            pi(n - 1);
        }
    }

