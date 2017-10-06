import java.util.Scanner;

/**
 * Created by Krasi on 4/9/2017.
 */
public class Uprajnenie {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        System.out.printf("+%s +%n",repeatstr(" -",n-2) );
        for (int i=1;i<=(n-2);i++){
            System.out.printf("|%s |%n",repeatstr(" -",n-2));

        }



        System.out.printf("+%s +%n ",repeatstr(" -",n-2) );

    }
    static String repeatstr (String strtorepeat ,int count){
        String text = "";
        for (int i = 0 ; i < count; i++) {
            text = text + strtorepeat ;
        }
        return text;
    }
}
