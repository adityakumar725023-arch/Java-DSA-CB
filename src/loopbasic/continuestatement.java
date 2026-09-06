package loopbasic;

import java.util.Scanner;

public class continuestatement {
    static void main() {
        Scanner sc=new Scanner(System.in);
        // 2 3 5 6 8 9..
      //  for (int i=1;i<=100;i++){
        //    if (i==14 || i==27) continue;
          //  if(i%2==0 || i%3==0)
            //    System.out.println(i);
    //}
        for (int i=1;i<=100;i++){
            System.out.println("hello");
            if (i%2==1) continue;
            System.out.println(i);
        }
}
}