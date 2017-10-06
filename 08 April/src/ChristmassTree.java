import java.util.Scanner;

/**
 * Created by Krasi on 4/12/2017.
 */
public class ChristmassTree {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer n = Integer.parseInt(console.nextLine());
        System.out.printf("%s|%s%n",repeatstr(" ",n+1),repeatstr(" ",n+1));
        for (int i=1; i<=n; i++){
            System.out.printf("%s%s |",repeatstr(" ",n-i),repeatstr("*",i));
            System.out.printf(" %s%s%n",repeatstr("*",i),repeatstr(" ",n-i));
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
