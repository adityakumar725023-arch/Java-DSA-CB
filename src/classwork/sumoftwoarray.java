package classwork;

import java.util.Scanner;

public class sumoftwoarray {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array:");
        int n= sc.nextInt();
        int a[]= new int[n];
        int b[]= new int[n];
        int c[]= new int[n];

        System.out.println("enter the first element of array");
       for (int i=0;i<n;i++)
        {
             a[i] = sc.nextInt();
        }
        System.out.println("enter the second element of arrya");
        for (int i=0;i<n;i++)
        {
             b[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            c[i]=a[i]+b[i];
        }
        System.out.println("sum of two array");
        for (int i=0;i<n;i++){
            System.out.println(c[i]+" ");
        }
    }
}
