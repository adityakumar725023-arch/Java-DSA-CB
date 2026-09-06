package conditionals;

import java.util.Scanner;

public class diviableby5 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        if(n%5==0){
            System.out.println("this number the diviable by 5");
        }
        else {
            System.out.println("this is not diviable by 5");
        }
    }
}
