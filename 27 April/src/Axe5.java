import java.util.Scanner;

/**
 * Created by Krasi on 4/27/2017.
 */
public class Axe5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer n = Integer.parseInt(console.nextLine());
        int rightside = 5 * n - (3 * n + 3);
        int downpart = 0;
        int insidepart = n - 1;
        int leftpart = n * 3;
        System.out.printf("%s**%s%n", repeatstr("-", n * 3), repeatstr("-", n * 2 - 2));
        for (int i = 1; i < n; i++) {
            System.out.printf("%s*%s*%s%n", repeatstr("-", 3 * n), repeatstr("-", i), repeatstr("-", rightside));
            rightside--;
        }
        rightside++;
        for (int j = 1; j <= n / 2; j++) {
            System.out.printf("%s%s*%s%n", repeatstr("*", n * 3 + 1), repeatstr("-", n - 1), repeatstr("-", rightside));
            downpart++;
        }
        for (int k = downpart - 1; k >= 1; k--) {
            System.out.printf("%s*%s*%s%n", repeatstr("-", leftpart), repeatstr("-", insidepart), repeatstr("-", rightside));
            leftpart--;
            insidepart += 2;
            rightside--;
        }
        insidepart+=2;
        System.out.printf("%s%s%s", repeatstr("-", leftpart), repeatstr("*",insidepart),repeatstr("-",rightside));
    }
    static String repeatstr (String strtorepeat ,int count){
        String text = "";
        for (int i = 0 ; i < count; i++) {
            text = text + strtorepeat ;
        }
        return text;
    }
}
