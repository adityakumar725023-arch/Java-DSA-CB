package arraylist;

public class slidingwindowproblem {
    static void main() {
        int[] customers = {10, 20, 30, 40, 50, 60};
        int k = 3;
        System.out.println(slidingwindowproblem(customers, k));
    }

    static int slidingwindowproblem(int[] customers, int k) {
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < k; i++) {
            sum += customers[i];
        }
        ans = sum;
        for (int i = k; i < customers.length; i++) {
            sum += customers[i];
            sum -= customers[i - k];
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}




