import java.util.Scanner;

/**
 * Created by Krasi on 5/6/2017.
 */
public class FallenInLove3 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        Integer n = Integer.parseInt(console.nextLine());
        int uppermiddle = 0;
        int upperside = n*2;
        int uppersidesimbol =0;
        int middlesidedots = 1;
        for (int i = upperside;i>=2;i-=2) {
            System.out.printf("#%s#%s#%s#%s#%s#%n", repeatstr("~", uppersidesimbol), repeatstr(".", upperside), repeatstr(".", uppermiddle), repeatstr(".", upperside), repeatstr("~", uppersidesimbol));
            uppermiddle += 2;
            upperside -= 2;
            uppersidesimbol++;
        }
        for (int i =1; i<=n;i++){
            System.out.printf("%s#%s#%s#%s#%s%n", repeatstr(".", middlesidedots), repeatstr("~", uppersidesimbol), repeatstr(".", uppermiddle), repeatstr("~", uppersidesimbol), repeatstr(".", middlesidedots));
            middlesidedots+=2;
            uppersidesimbol--;
            uppermiddle-=2;
        }
        System.out.printf("%s####%s%n",repeatstr(".",middlesidedots),repeatstr(".",middlesidedots));
        middlesidedots++;
        for (int i = 1;i<=n;i++){
            System.out.printf("%s##%s%n",repeatstr(".",middlesidedots),repeatstr(".",middlesidedots));
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
