package loopbasic;

import java.util.Scanner;

public class apuptonterms {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n= sc.nextByte();
        // 1 3 5 7 9 2n-1
      //  for (int i=1;i<=2*n-1;i+=2){
        //4 7 10 13  3n+1
       // for (int i=4;i<=3*n+1;i+=3){
         //   System.out.println(i);
        //}
     int a=3, d=4;
     for (int i=1;i<=n;i++){
         System.out.println(a+" ");
         a+=d;
     }
    }
}
