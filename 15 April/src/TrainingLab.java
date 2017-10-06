import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Krasi on 4/15/2017.
 */
public class TrainingLab {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");
       Double duljina = Double.parseDouble(console.nextLine());
        Double shirochina = Double.parseDouble(console.nextLine());
        Double duljinamqsto = 1.2;
        Double shirochinamqsto = 0.7;
        Double zaguba = shirochina - 1;
       Double polzvanashirochina = zaguba / shirochinamqsto;
       int polzvanashirochina1 = polzvanashirochina.intValue();
        Double polzvanaduljina = duljina / duljinamqsto ;
        int polzvanaduljina1 = polzvanaduljina.intValue();
        Integer result = polzvanaduljina1*polzvanashirochina1-3;
        System.out.println(result);
    }
}
