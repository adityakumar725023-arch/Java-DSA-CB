package conditional;

import java.util.Scanner;
import java.util.zip.ZipEntry;

public class nestedthreeandfivebutnotfifteen {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextByte();
       // if (n % 3 == 0 || n % 5 == 0) {
          //  if (n % 15 != 0) {
               // System.out.println("the number is divisible by 3 or 5 but not fifteen");
           // } else {
              //  System.out.println("not matching the required condition");
           // }
       // } else {
            //System.out.println("not matching the required condition");
      //  }
        if ((n%3==0 || n%5==0 )&& n%15!=0)
        {
            System.out.println("the number is divisible by 3 or 5 but not fifteen");
        }
        else {
            System.out.println("not matching the required condition");
        }
    }
    }
