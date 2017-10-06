import java.util.Scanner;

/**
 * Created by Krasi on 5/4/2017.
 */
public class Rocket5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer n = Integer.parseInt(console.nextLine());
        int upperside = (3 * n - 2) / 2;
        int uppermiddle = 0;
        int downmiddle = n*2-2;
        for (int i = upperside; i >= n / 2; i--) {
            System.out.printf("%s/%s\\%s%n", repeatstr(".", i), repeatstr(" ", uppermiddle), repeatstr(".", i));
            uppermiddle += 2;
        }
        System.out.printf("%s%s%s%n",repeatstr(".",n/2),repeatstr("*",n*2),repeatstr(".",n/2));
        for (int i = 1;i<=n*2;i++){
            System.out.printf("%s|%s|%s%n",repeatstr(".",n/2),repeatstr("\\",n*2-2),repeatstr(".",n/2));
        }
        for (int i = n/2; i>=1;i--){
            System.out.printf("%s/%s\\%s%n",repeatstr(".",i),repeatstr("*",downmiddle),repeatstr(".",i));
            downmiddle+=2;
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
