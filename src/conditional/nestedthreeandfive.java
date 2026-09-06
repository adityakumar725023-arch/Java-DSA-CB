package conditional;

import java.util.Scanner;

public class nestedthreeandfive {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextByte();
        if (n % 3 == 0) {
            if (n % 5 == 0) {
                System.out.println("the number is divisilble by 5 and 3 both");
            } else {
                System.out.println("not divisible ");
            }
        }
        else{
                System.out.println("not divisible");
            }
        }
    }

