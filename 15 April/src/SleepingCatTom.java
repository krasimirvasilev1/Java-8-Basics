import java.util.Scanner;

/**
 * Created by Krasi on 4/17/2017.
 */
public class SleepingCatTom {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer freedays = Integer.parseInt(console.nextLine());
        Integer notworkingdays = freedays * 127 ;
        Integer workingdays = (365 - freedays) * 63;
        Integer all = workingdays + notworkingdays;
        Integer hours =(30000- all) / 60 ;
        Integer minutes =(30000- all) % 60 ;
        if (30000 - all > 0){
            System.out.println("Tom sleeps well");
            System.out.println(Math.abs(hours)+" hours and " +Math.abs(minutes)+" minutes less for play");}
            else if (30000 - all <= 0){
                System.out.println("Tom will run away");
                System.out.println(Math.abs(hours)+" hours and " +Math.abs(minutes)+" minutes more for play");
        }
    }
}
