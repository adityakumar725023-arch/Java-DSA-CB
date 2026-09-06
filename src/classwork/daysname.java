package classwork;

public class daysname {
    static void main() {
        int day = 1;
        switch (day) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tueday");
            case 3 -> System.out.println("wednesday");
            default-> System.out.println("invaild day");
        }
    }
}