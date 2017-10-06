import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Krasi on 5/7/2017.
 */
public class SchoolCamp3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String season = console.nextLine();
        String grouptype = console.nextLine();
        Integer numstudents = Integer.parseInt(console.nextLine());
        Integer numnights = Integer.parseInt(console.nextLine());
        double boys = 0;
        double girls = 0;
        double mixed = 0 ;
        DecimalFormat df = new DecimalFormat("0.00");
        if (season.equals("Winter")) {
            if (grouptype.equals("boys")) {
                boys = numstudents * 9.60;
            }
            else if (grouptype.equals("girls")){
                girls = numstudents * 9.60;
            }
            else if (grouptype.equals("mixed")){
                mixed = numstudents*10;
            }
        }
        if (season.equals("Spring")) {
            if (grouptype.equals("boys")) {
                boys = numstudents * 7.20;
            }
            else if (grouptype.equals("girls")){
                girls = numstudents * 7.20;
            }
            else if (grouptype.equals("mixed")){
                mixed = numstudents*9.50;
            }
        }
        if (season.equals("Summer")) {
            if (grouptype.equals("boys")) {
                boys = numstudents * 15.00;
            }
            else if (grouptype.equals("girls")){
                girls = numstudents * 15.00;
            }
            else if (grouptype.equals("mixed")){
                mixed = numstudents*20;
            }
        }
        double sum = (boys+girls+mixed)*numnights;
        if (numstudents>=50){
            sum = sum -(sum * 0.50);
        }
        else if (numstudents>=20 && numstudents<50){
            sum = sum - (sum *0.15);
        }
        else if (numstudents>=10 && numstudents<20){
            sum = sum - (sum*0.05);
        }
        if (season.equals("Winter")){
            if (grouptype.equals("boys")){
                System.out.println("Judo "+df.format(sum)+" lv.");
            }
            else if (grouptype.equals("girls")){
                System.out.println("Gymnastics "+df.format(sum)+" lv.");
            }
            else if (grouptype.equals("mixed")){
                System.out.println("Ski "+df.format(sum)+" lv.");
            }
        }
        if (season.equals("Spring")){
            if (grouptype.equals("boys")){
                System.out.println("Tennis "+df.format(sum)+" lv.");
            }
            else if (grouptype.equals("girls")){
                System.out.println("Athletics "+df.format(sum)+" lv.");
            }
            else if (grouptype.equals("mixed")){
                System.out.println("Cycling "+df.format(sum)+" lv.");
            }
        }
        if (season.equals("Summer")){
            if (grouptype.equals("boys")){
                System.out.println("Football "+df.format(sum)+" lv.");
            }
            else if (grouptype.equals("girls")){
                System.out.println("Volleyball "+df.format(sum)+" lv.");
            }
            else if (grouptype.equals("mixed")){
                System.out.println("Swimming "+df.format(sum)+" lv.");
            }
        }

    }
}
