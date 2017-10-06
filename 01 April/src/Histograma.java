import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Krasi on 4/5/2017.
 */
public class Histograma {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer n = Integer.parseInt(console.nextLine());
       double p1 = 0.0;
        double p2 = 0.0;
        double p3 = 0.0;
        double p4 = 0.0;
        double p5 = 0.0;
        DecimalFormat format = new DecimalFormat("0.00");
       for (int i = 1; i <= n; i++) {
            Integer number = Integer.parseInt(console.nextLine());
            if (number < 200) {
                p1 += 1;
            } else if (number >= 200 && number < 400) {
                p2 += 1;
            } else if (number >= 400 && number < 600) {
                p3 += 1;
            } else if (number >= 600 && number < 800) {
                p4 += 1;
            } else {
                p5 += 1;
            }
        }
       double a = (p1/n)*100;
        double b = (p2/n)*100;
        double c = (p3/n)*100;
        double d = (p4/n)*100;
        double e = (p5/n)*100;
        System.out.printf("%s%n",format.format(a)+"%");
        System.out.printf("%s%n",format.format(b)+"%");
        System.out.printf("%s%n",format.format(c)+"%");
        System.out.printf("%s%n",format.format(d)+"%");
        System.out.printf("%s%n",format.format(e)+"%");
        }
    }
