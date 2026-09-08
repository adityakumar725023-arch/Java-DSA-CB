package arraylist;

import java.util.ArrayList;

public class Addnumber {
    private static int carry;

    static void main() {
        int[] arr1 = {2, 4, 5, 6, 6};
        int[] arr2 = {3, 3, 4, 5, 6, 6};
        Addnumber(arr1, arr2);
    }
    static void Addnumber(int[] arr1, int[] arr2) {

        ArrayList<Integer> ll = new ArrayList<>();

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int carry = 0;
        while (i >= 0 && j >= 0) {
            int sum = arr1[i] + arr2[j] + carry;
            ll.add(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
        while (i >= 0) {
            int sum = arr1[i] + carry;
            ll.add(sum % 10);
            carry = sum / 10;
            i--;
        }
        while (j >= 0) {
            int sum = arr2[j] + carry;
            ll.add(sum % 10);
            carry = sum / 10;
            j--;
        }
        for (int k = ll.size() - 1; k >= 0; k--) {
            System.out.println(ll.get(k) + " ");
        }
    }
}



