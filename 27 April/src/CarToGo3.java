import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Krasi on 5/6/2017.
 */
public class CarToGo3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Double budget = Double.parseDouble(console.nextLine());
        String season = console.nextLine();
        DecimalFormat df = new DecimalFormat("0.00");
        if (budget<=100){
            if (season.equals("Summer")){
                System.out.println("Economy class");
                System.out.println("Cabrio - "+df.format(budget*(35/100)));
            }
            else if (season.equals("Winter")){
                System.out.println("Economy class");
                System.out.println("Jeep - "+df.format(budget*(65/100)));
            }
        }
        else if (budget>100 && budget<=500){
            if (season.equals("Summer")){
                System.out.println("Compact class");
                System.out.println("Cabrio - "+df.format(budget*(45/100)));
            }
            else if (season.equals("Winter")){
                System.out.println("Compact class");
                System.out.println("Jeep - "+df.format(budget*(80/100)));
            }
        }
        else if (budget>500 ){
            if (season.equals("Winter")|| season.equals("Summer")){
                System.out.println("Luxury class");
                System.out.println("Jeep - "+df.format((budget*(90/100))));
            }
        }
    }
}
