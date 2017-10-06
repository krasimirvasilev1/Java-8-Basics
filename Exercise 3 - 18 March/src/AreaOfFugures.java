import java.util.Scanner;

/**
 * Created by Krasi on 3/18/2017.
 */
public class AreaOfFugures {
    public static void main(String[] args) {
            Scanner console = new Scanner (System.in);
        String something = console.nextLine();
        if (something.equals("square")){
            Double a1 =Double.parseDouble(console.nextLine());
            System.out.printf("%.3f",(a1*a1));}
        else if (something.equals("rectangle")){
            Double a1 =Double.parseDouble(console.nextLine());
            Double a2= Double.parseDouble(console.nextLine());
            System.out.printf ("%.3f",(a1*a2));}
        else if(something.equals("circle")){
            Double a1 =Double.parseDouble(console.nextLine());
            System.out.printf("%.3f",(Math.PI*a1*a1));}
        else if (something.equals("triangle")){
            Double a1 =Double.parseDouble(console.nextLine());
            Double a2= Double.parseDouble(console.nextLine());
            System.out.printf("%.3f",(a1*a2/2));}

    }
}