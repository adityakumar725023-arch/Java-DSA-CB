package classwork;

import java.util.Scanner;

public class vowelandconsonant {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character");
        char ch=sc.next().charAt(0);
        switch (0)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("vowel");
                break;
            default :
                System.out.println("consonant");
        }
    }
}
