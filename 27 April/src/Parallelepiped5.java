import java.util.Scanner;

/**
 * Created by Krasi on 4/30/2017.
 */
public class Parallelepiped5 {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            Integer n = Integer.parseInt(console.nextLine());
            int middle = n-2;
            int rightside = n*2+1;
            int rightsidebottom = n*2;
            System.out.printf("+%s+%s%n", repeatstr("~", middle),repeatstr(".",rightside));
            rightside--;

            for (int i = 0; i <= n * 2;i++){
                System.out.printf("|%s\\%s\\%s%n",repeatstr(".",i),repeatstr("~",middle),repeatstr(".",rightside));
                rightside--;
            }
            rightside += n*2+2;
            for (int i = 0;i<=n*2;i++){
                System.out.printf("%s\\%s|%s|%n",repeatstr(".",i),repeatstr(".",rightsidebottom),repeatstr("~",middle));
                rightsidebottom--;
            }
            System.out.printf("%s+%s+%n", repeatstr(".", rightside),repeatstr("~",middle));
        }
        static String repeatstr (String strtorepeat ,int count){
            String text = "";
            for (int i = 0 ; i < count; i++) {
                text = text + strtorepeat ;
            }
            return text;
        }
    }