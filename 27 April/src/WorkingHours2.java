import java.util.Scanner;

/**
 * Created by Krasi on 5/6/2017.
 */
public class WorkingHours2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer hoursneeded = Integer.parseInt(console.nextLine());
        Integer numworkers = Integer.parseInt(console.nextLine());
        Integer workingdays = Integer.parseInt(console.nextLine());
        int workers = (numworkers*8 ) * workingdays;
        int wastedmoney = (hoursneeded - workers)*workingdays;
        if (workers>=hoursneeded){
            System.out.println((workers-hoursneeded)+" hours left");

        }
        else{
            System.out.println(Math.abs(hoursneeded-workers)+" overtime");
            System.out.println("Penalties: "+wastedmoney);
        }
    }
}
