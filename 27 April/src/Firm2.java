import java.util.Scanner;

/**
 * Created by Krasi on 4/27/2017.
 */
public class Firm2 {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            Integer hoursfortheproject = Integer.parseInt(console.nextLine());
            Integer daystobedone = Integer.parseInt(console.nextLine());
            Integer workersadditional = Integer.parseInt(console.nextLine());
            double days = daystobedone - daystobedone*0.10;
            double daysinhours = Math.floor(days * 8 + workersadditional*2*daystobedone);
            if (daysinhours>= hoursfortheproject){
                System.out.println("Yes!"+(int)Math.floor(daysinhours-hoursfortheproject)+" hours left.");
            }
            else{
                System.out.println("Not enough time!"+(int)Math.floor(hoursfortheproject-daysinhours)+" hours needed.");
            }

        }
    }

