import java.util.Scanner;

/**
 * Created by Krasi on 4/12/2017.
 */
public class House1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer n = Integer.parseInt(console.nextLine());
        if (n % 2 == 0)
        for (int i = 2;i<=n;i+=2){
            System.out.printf("%s%s%s%n",repeatstr("-",(n-i)/2),repeatstr("*",i),repeatstr("-",(n-i)/2));
        }
        else if (n % 2 ==1){
            for (int i = 1;i<=n;i+=2){
                System.out.printf("%s%s%s%n",repeatstr("-",(n-i)/2),repeatstr("*",i),repeatstr("-",(n-i)/2));
            }
        }
        for (int i = 0; i<=n/2-1;i++){
            System.out.printf("|%s|%n",repeatstr("*",n-2));

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
