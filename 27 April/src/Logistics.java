import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Krasi on 4/29/2017.
 */
public class Logistics {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer num = Integer.parseInt(console.nextLine());
        int microbus = 0;
        int truck = 0;
        int train = 0;
        int sumtons = 0;
        int sumtonsmicrobus = 0;
        int sumtonstruck = 0;
        int sumtonstrain = 0;
        DecimalFormat df = new DecimalFormat("0.00");
        DecimalFormat df1 = new DecimalFormat("00.00");
        for (int i = 1; i<=num ; i++) {
            Integer tons = Integer.parseInt(console.nextLine());
            sumtons += tons;
            if (tons <= 3) {
                microbus += tons * 200;
                sumtonsmicrobus+=tons;
            } else if (tons > 3 && tons <= 11) {
                truck += tons * 175;
                sumtonstruck+=tons;
            } else if (tons > 11) {
                train += tons * 120;
                sumtonstrain+=tons;
            }
        }
        int sum = microbus+truck+train;
            System.out.println(df.format(sum/sumtons));
            System.out.println((sumtonsmicrobus/sumtons*100)+" %");
            System.out.println((sumtonstrain/ sumtons*100)+" %");
            System.out.println((sumtonstruck/sumtons*100)+" %");

    }
}
