import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Krasi on 5/6/2017.
 */
public class DogHouse1 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        Double lenghthouse = Double.parseDouble(console.nextLine());
        Double heighthouse = Double.parseDouble(console.nextLine());
        double rearwalls = ((lenghthouse * (lenghthouse/2))*2);
        double square = (lenghthouse/2)*(lenghthouse/2);
        double walls = (lenghthouse/2*(heighthouse-lenghthouse/2))/2;
        double backwall = square+walls;
        double frontwall = backwall-(lenghthouse/5)*(lenghthouse/5);
        double ceil = (lenghthouse*(lenghthouse/2))*2;
        double all = rearwalls+backwall+frontwall;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(all/3));
        System.out.println(df.format(ceil/5));
    }
}
