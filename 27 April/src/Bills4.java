import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Krasi on 4/30/2017.
 */
public class Bills4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer monthsaverage = Integer.parseInt(console.nextLine());
        double electricity = 0;
        double water = 0;
        double internet = 0;
        DecimalFormat df = new DecimalFormat("0.00");
       for ( int i = 1; i<=monthsaverage;i++){
           Double electricitybill = Double.parseDouble(console.nextLine());
           electricity +=electricitybill;
           water+=20;
           internet+=15;
        }
        double other =  (electricity+water+internet)+(electricity+water+internet)*0.20;
        double sum = electricity+water+internet+other;
        System.out.println("Electricity: "+df.format(electricity)+" lv");
        System.out.println("Water: "+df.format(water)+" lv");
        System.out.println("Internet: "+df.format(internet)+" lv");
        System.out.println("Other: "+df.format(other)+" lv");
        System.out.println("Average: "+df.format(sum/monthsaverage)+" lv");
    }
}
