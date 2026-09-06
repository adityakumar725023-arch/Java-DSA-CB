package conditional;

import java.util.Scanner;

public class areaofperimeter {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length");
        int length = sc.nextInt();
        System.out.println("enter the breadth");
        int breadth= sc.nextInt();
        int area=length*breadth;
        int perimeter=2*(length+breadth);
        if (area>perimeter){
            System.out.println("area is greather than perimeter");
        }
        else if(perimeter>area) {
            System.out.println("perimeter is greater than area");
        }
        else {
            System.out.println("area is equle to perimeter");
        }
    }
}
