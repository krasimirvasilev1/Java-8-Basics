import java.util.Scanner;

/**
 * Created by Krasi on 4/22/2017.
 */
public class EnteringEvenNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer num = Integer.parseInt(console.nextLine());
        if (num % 2 == 0){
            System.out.println("Even number entered:"+num);
        }
        else {
            System.out.println("Invalid number");
            num =Integer.parseInt(console.nextLine());
        }
    }
}
