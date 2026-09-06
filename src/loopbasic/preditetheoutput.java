package loopbasic;

public class preditetheoutput {
    static void main() {
        int x = 4, y = 0;
        while (x >= 0) {
            x--;
            y++;
            if (x == y)
                continue;
            else
                System.out.println(x + "" + y);
        }
    }
}
