import java.util.Scanner;

/**
 * Created by Krasi on 4/15/2017.
 */
public class Butterfly {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer n = Integer.parseInt(console.nextLine());
        for (int i = 1;i <= n-2;i+=2) {
            if (i <= n - 2) {
                System.out.printf("%s\\ /%s%n", repeatstr("*", n - 2), repeatstr("*", n - 2));
            }
            if (i < n-2){
                System.out.printf("%s\\ /%s%n", repeatstr("-", n - 2), repeatstr("-", n - 2));
            }
        }
        System.out.printf("%s@%n",repeatstr(" ",(n-2+1)));
        for (int i = 1;i <= n-2;i+=2) {
            if (i <= n - 2) {
                System.out.printf("%s/ \\%s%n", repeatstr("*", n - 2), repeatstr("*", n - 2));
            }
            if (i < n-2){
                System.out.printf("%s/ \\%s%n", repeatstr("-", n - 2), repeatstr("-", n - 2));
            }
        }
    }

    static String repeatstr (String strtorepeat ,int count){
        String text = "";
        for (int i = 0 ; i < count; i++) {
            text = text + strtorepeat ;
        }
        return text;
    }
}

