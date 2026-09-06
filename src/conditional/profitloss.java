package conditional;

import java.util.Scanner;

public class profitloss {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the cost price");
        int cp= sc.nextInt();
        System.out.println("enter the selling price");
        int sp= sc.nextInt();
        if (sp>cp){
            System.out.print("you  profit is ;");
            System.out.println(sp-cp);
        }
        else {
            System.out.print("you loss is :");
            System.out.println(cp-sp);
        }
    }
}
