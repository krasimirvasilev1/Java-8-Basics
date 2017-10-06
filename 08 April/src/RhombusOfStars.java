import java.util.Scanner;

/**
 * Created by Krasi on 4/8/2017.
 */
public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i = 1; i <= n; i++) {
            System.out.print(repeatStr(" ", n - i));
            System.out.println(repeatStr("* ", i));
        }

        for (int i =1;i <=n-1; i++){
            System.out.print(repeatStr(" ",i));
            System.out.println(repeatStr("* ",n-i));
        }
    }
    static String repeatStr (String strToRepeat, int count){
        String text = "";
        for (int i = 0;i<count;i++){
            text= text +strToRepeat;
        }
        return text;
    }
}

