import java.util.Scanner;

/**
 * Created by Krasi on 4/24/2017.
 */
public class EnteringPrimeNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number  = 1 ;
        do {
            try {
                number = Integer.parseInt(console.nextLine());
                if (number % 2 != 0 ){
                    System.out.println("The number is not even.");}
            }
            catch (Exception e){
                System.out.println("Invalid number!");
            }
        }
    while (number % 2 != 0 );
        System.out.println("Even number entered: "+number);
        }
    }
