import java.util.Scanner;

/**
 * Created by Krasi on 3/19/2017.
 */
public class ExcellentOrNot {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double grade = Double.parseDouble(console.nextLine());
        if (grade>=5.50){
            System.out.println("Excellent!");
        }
        else if (grade<=5.50){
            System.out.println("Not excellent.");}
    }
}
