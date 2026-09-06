package classwork;

public class fibonacciseries {
    static void main() {
        int a = 0,b=1;
        System.out.println("fibonacci series up to 100:"+a+" "+b+" ");

            int c=a+b;
            while (c<=100){
            System.out.println(c+" ");
            a=b;
            b=c;
            c=a+b;
        }
    }
}
