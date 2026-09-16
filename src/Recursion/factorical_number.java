package Recursion;

public class factorical_number {
    static void main() {
        int n=7;
        System.out.print(fact(n));
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fn=fact(n-1);
        return n*fn;
    }
}
