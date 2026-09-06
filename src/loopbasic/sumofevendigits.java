package loopbasic;

import java.util.Scanner;

public class sumofevendigits {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the digits:");
        int n= sc.nextInt();
        int sum=0;
        while (n!=0){
            int digit=n%10;
            if (digit%2==0)
            sum=sum+digit;
            n= n/10;
        }
        System.out.println(sum);
    }
}


