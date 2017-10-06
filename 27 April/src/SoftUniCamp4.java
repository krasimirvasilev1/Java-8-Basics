import java.util.Scanner;

/**
 * Created by Krasi on 5/4/2017.
 */
public class SoftUniCamp4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer groupsstudents = Integer.parseInt(console.nextLine());
        int car = 0;
        int microbus = 0 ;
        int smallbus = 0;
        int bigbus = 0;
        int train = 0;
        for (int i = 1;i<=groupsstudents;i++){
            Integer numpeople = Integer.parseInt(console.nextLine());
            if (numpeople<= 5){
car += numpeople;
            }
            else if (numpeople>5 && numpeople<=12){
                microbus += numpeople;
            }
            else if (numpeople>12 && numpeople<=25){
                smallbus+= numpeople;
            }
            else if (numpeople>25 && numpeople<=40){
                bigbus+=numpeople;
            }
            else if (numpeople>40){
                train+=numpeople;
            }
        }
        double all = car+microbus+smallbus+bigbus+train;
        System.out.printf("%.2f",((car/all)*100));
        System.out.println("%");
        System.out.printf("%.2f",((microbus/all)*100));
        System.out.println("%");
        System.out.printf("%.2f",((smallbus/all)*100));
        System.out.println("%");
        System.out.printf("%.2f",((bigbus/all)*100));
        System.out.println("%");
        System.out.printf("%.2f",((train/all)*100));
        System.out.println("%");

    }
}
