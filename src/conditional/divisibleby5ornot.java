package conditional;

import java.util.Scanner;

public class divisibleby5ornot {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        if(n%5==0){
            System.out.println("the number is divible by 5");
        }
        else {
            System.out.println("the number is not divible by 5");
        }
    }
}
