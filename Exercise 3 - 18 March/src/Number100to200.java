import java.util.Scanner;

/**
 * Created by Krasi on 3/18/2017.
 */
public class Number100to200 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer num = Integer.parseInt(console.nextLine());
        if (100>num){
            System.out.println("Less than 100");}
            else if (num>=100 && num<=200){
            System.out.println("Between 100 and 200");}
            else if (num>200){
            System.out.println("Greater than 200");

        }
    }
}
