package classwork;

import java.util.Scanner;

public class primenumber {
    static void main() {
   int n,i=2;
        System.out.println("enter number to check for prime number:");
        Scanner input = new Scanner(System.in);
        n= input.nextInt();
        if(n==1||n==0)
            System.out.println(""+n+" is not a prime number");
        else if(n==2)
            System.out.println(""+n+" is a prime number");
        else{
            for(i=2;i<n;i++){
                if(n%i==0){
                    System.out.println(""+n+" is not a prime number");
                    break;
                }
            }
        }
   }
}
