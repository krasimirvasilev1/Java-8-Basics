import java.util.Scanner;

/**
 * Created by Krasi on 4/12/2017.
 */
public class SunGlasses1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer n = Integer.parseInt(console.nextLine());
        System.out.print(repeatstr("*",n*2));
        System.out.print(repeatstr(" ",n));
        System.out.println(repeatstr("*",n*2));

        for (int i=0;i<n-2;i++){
            System.out.printf("*%s*",repeatstr("/",n*2-2));
            if ((n-1)/2-1 == i){
                System.out.print(repeatstr("|",n));}
                else {
                System.out.print(repeatstr(" ",n));
            }
            System.out.printf("*%s*%n",repeatstr("/",n*2-2));
            }
        System.out.print(repeatstr("*",n*2));
        System.out.print(repeatstr(" ",n));
        System.out.print(repeatstr("*",n*2));
        }

    static String repeatstr (String strtorepeat ,int count){
        String text = "";
        for (int i = 0 ; i < count; i++) {
            text = text + strtorepeat ;
        }
        return text;
    }
}
