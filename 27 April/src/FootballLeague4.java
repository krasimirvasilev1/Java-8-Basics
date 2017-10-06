import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Krasi on 5/7/2017.
 */
public class FootballLeague4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Double capacity = Double.parseDouble(console.nextLine());
        Double fans = Double.parseDouble(console.nextLine());
        double A = 0;
        double B = 0;
        double V = 0;
        double G = 0;
        DecimalFormat df = new DecimalFormat("0.00");
        for (int i = 1; i<=fans;i++){
            String sector = console.nextLine();
            if (sector.equals("A")){
                A++;
            }
            else if (sector.equals("B")){
                B++;
            }
            else  if (sector.equals("V")){
                V++;
            }
            else if (sector.equals("G")){
                G++;
            }
        }
        System.out.println(df.format((A/fans)*100)+"%");
        System.out.println(df.format((B/fans)*100)+"%");
        System.out.println(df.format((V/fans)*100)+"%");
        System.out.println(df.format((G/fans)*100)+"%");
        System.out.println(df.format((fans/capacity)*100)+"%");


    }
}
