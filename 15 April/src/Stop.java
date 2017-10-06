import java.util.Scanner;

/**
 * Created by Krasi on 4/18/2017.
 */
public class Stop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer n = Integer.parseInt(console.nextLine());
        Integer middle = n*2-1;
        Integer firstsides = n ;
        System.out.printf("%s%s%s%n",repeatstr(".",n+1),repeatstr("_",middle+2),repeatstr(".",n+1));
        for (int i = 1 ; i<=n;i++){
            System.out.printf("%s//%s\\\\%s%n",repeatstr(".",firstsides),repeatstr("_",middle),repeatstr(".",firstsides));
            firstsides-=1;
            middle+=2;
        }
        int drawmiddle = ((n-1)+((n*2)+1)+(n-1))-5;
        System.out.printf("//%sSTOP!%s\\\\%n",repeatstr("_",drawmiddle/2),repeatstr("_",drawmiddle/2));
        for (int i = 1 ; i<=n;i++){
            System.out.printf("%s\\\\%s//%s%n",repeatstr(".",firstsides),repeatstr("_",middle),repeatstr(".",firstsides));
            firstsides+=1;
            middle-=2;
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
