package classwork;

public class palindromenumber {
    static void main() {
        int num =131;
        int temp=num;
        int rev=0;
        while (temp > 0) {
            int digit=temp%10;
            rev=rev*10+digit;
            temp=temp/10;
        }
        if (num == rev) {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }

    }
}
