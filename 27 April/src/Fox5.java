import java.util.Scanner;

/**
 * Created by Krasi on 5/4/2017.
 */
public class Fox5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer n = Integer.parseInt(console.nextLine());
        int uppermiddle = 2*n+3;
       int centralmiddle = n;
        int sidesmiddle = n/2;
        int downmiddle = 2*n+3;
        for (int i = 1; i<=n;i++){
            System.out.printf("%s\\%s/%s%n",repeatstr("*",i),repeatstr("-",uppermiddle-4),repeatstr("*",i));
            uppermiddle-=2;
        }
        for (int i = 1; i<=n/3;i++){
            System.out.printf("|%s\\%s/%s|%n",repeatstr("*",sidesmiddle),repeatstr("*",centralmiddle),repeatstr("*",sidesmiddle));
            sidesmiddle++;
            centralmiddle-=2;
        }
        for (int i = 1; i<=n;i++) {
            System.out.printf("%s\\%s/%s%n", repeatstr("-", i), repeatstr("*", downmiddle - 4), repeatstr("-", i));
            downmiddle -= 2;

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
