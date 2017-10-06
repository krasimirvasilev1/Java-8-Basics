import java.util.Scanner;

/**
 * Created by Krasi on 5/7/2017.
 */
public class Crown5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer n = Integer.parseInt(console.nextLine());
        int halfwide = ((2 * n - 1) - 3) / 2;
        int middle = 1;
        System.out.printf("@%s@%s@%n", repeatstr(" ", halfwide), repeatstr(" ", halfwide));
        halfwide--;
        System.out.printf("**%s*%s**%n", repeatstr(" ", halfwide), repeatstr(" ", halfwide));
        halfwide-=2;
        for (int i = 1; i <= n / 2-2; i++) {
            System.out.printf("*%s*%s*%s*%s*%s*%n", repeatstr(".", i), repeatstr(" ", halfwide), repeatstr(".", middle), repeatstr(" ", halfwide), repeatstr(".", i));
            middle+=2;
            halfwide -= 2;
        }
        int middlestars = (middle-1)/2;
        System.out.printf("*%s*%s*%s*%n",repeatstr(".",n/2-1),repeatstr(".",middle),repeatstr(".",n/2-1));
        System.out.printf("*%s%s.%s%s*%n",repeatstr(".",n/2),repeatstr("*",middlestars),repeatstr("*",middlestars),repeatstr(".",n/2));
        System.out.printf("%s%n",repeatstr("*",2*n-1));
        System.out.printf("%s%n",repeatstr("*",2*n-1));
    }


    static String repeatstr (String strtorepeat ,int count){
        String text = "";
        for (int i = 0 ; i < count; i++) {
            text = text + strtorepeat ;
        }
        return text;
    }
}
