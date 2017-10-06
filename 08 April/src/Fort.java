import java.util.Scanner;

/**
 * Created by Krasi on 4/13/2017.
 */
public class Fort {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer n = Integer.parseInt(console.nextLine());
        System.out.printf("/%s\\", repeatstr("^", n / 2));
        if (n > 4) {
            System.out.printf(repeatstr("_", n / 2));
        }
        System.out.printf("/%s\\%n", repeatstr("^", n / 2));
        for (int i = 1; i <= n - 2; i++) {
            System.out.printf("|%s", repeatstr(" ", n / 2));
            System.out.printf("%s", repeatstr(" ", 1));
            if (n > 4 && i == n - 2) {
                System.out.printf("%s", repeatstr("_", n / 2));
            } else if (n > 4) {
                System.out.printf("%s", repeatstr(" ", n / 2));
            }
            System.out.printf("%s", repeatstr(" ", 1));
            System.out.printf("%s|%n", repeatstr(" ", n / 2));
    }
        System.out.printf("\\%s/", repeatstr("_", n / 2));
        if (n > 4) {
            System.out.printf(repeatstr(" ", n / 2));
        }
        System.out.printf("\\%s/%n", repeatstr("_", n / 2));


}

    static String repeatstr (String strtorepeat ,int count){
        String text = "";
        for (int i = 0 ; i < count; i++) {
            text = text + strtorepeat ;
        }
        return text;
    }
}

