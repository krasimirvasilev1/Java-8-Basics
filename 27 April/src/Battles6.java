import java.util.Scanner;

/**
 * Created by Krasi on 5/4/2017.
 */
public class Battles6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer firstplayer = Integer.parseInt(console.nextLine());
        Integer secondplayer = Integer.parseInt(console.nextLine());
        Integer maximumbattles = Integer.parseInt(console.nextLine());
        int battles = 0;
        for (int i = 1; i <= firstplayer; i++) {
            for (int j = 1; j <= secondplayer; j++) {
                if (maximumbattles == battles) {
                    break;
                }
                battles++;
                System.out.print("("+i+" <-> "+j+")"+" ");
            }
            if (maximumbattles == battles) {
                break;
            }
        }
    }
}
