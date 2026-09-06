package conditionals;

import java.util.Scanner;

public class thepointisorigin {
    static void main() {
        Scanner sc=new Scanner(System.in);
        double x=9,y=10;
        if (x==0&&y==0){
            System.out.println("the point is origin");
        } else if (x==0) {
            System.out.println("the point line on y -axis");
        } else if (y==0) {
            System.out.println("the point lie on x-axis");
        }
        else {
            System.out.println("the point either  x axis or y- axis");
        }

    }
}
