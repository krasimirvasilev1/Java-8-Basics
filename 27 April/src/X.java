import java.util.Scanner;

/**
 * Created by Krasi on 5/27/2017.
 */
public class X {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer n = Integer.parseInt(console.nextLine());
        int sidetop = 0;
        int insidetop = n - 2;
        int insidebottom = 1;
        for (int i = 1; i <= n / 2; i++)
        {
            System.out.printf("%sx%sx%s%n", repeatstr(" ", sidetop), repeatstr(" ", insidetop), repeatstr(" ", sidetop));
            sidetop++;
            insidetop-=2;

        }
        System.out.printf("%sx%s%n",repeatstr(" ",sidetop),repeatstr(" ",sidetop));
        for (int i = 1; i <= n / 2; i++){
            sidetop--;
            System.out.printf("%sx%sx%s%n", repeatstr(" ", sidetop), repeatstr(" ", insidebottom), repeatstr(" ", sidetop));
            insidebottom+=2;
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
