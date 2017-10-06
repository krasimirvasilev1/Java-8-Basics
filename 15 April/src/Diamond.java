import java.util.Scanner;

/**
 * Created by Krasi on 4/27/2017.
 */
public class Diamond {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer n =Integer.parseInt(console.nextLine());
        int middle = n*3;
        int lastrow = ((n*5 -(n-2))/2);
        System.out.printf("%s%s%s%n",repeatstr(".",n),repeatstr("*",3*n),repeatstr(".",n));
        for (int i = n-1;i>=1;i--){
            System.out.printf("%s*%s*%s%n",repeatstr(".",i),repeatstr(".",middle),repeatstr(".",i));
            middle+=2;
        }
        middle-=2;
        System.out.printf("%s%n",repeatstr("*",n*5));
        for (int i = 1; i<(3*n+2)-(n+1);i++){
            System.out.printf("%s*%s*%s%n",repeatstr(".",i),repeatstr(".",middle),repeatstr(".",i));
            middle-=2;
        }
        System.out.printf("%s%s%s%n",repeatstr(".",lastrow),repeatstr("*",n-2),repeatstr(".",lastrow));
    }

    static String repeatstr (String strtorepeat ,int count){
        String text = "";
        for (int i = 0 ; i < count; i++) {
            text = text + strtorepeat ;
        }
        return text;
    }
}
