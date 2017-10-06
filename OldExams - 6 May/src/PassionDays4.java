import java.util.Scanner;

/**
 * Created by Krasi on 5/6/2017.
 */
public class PassionDays4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer money = Integer.parseInt(console.nextLine());
        String enter = console.nextLine();
        String exit = console.nextLine();
        int countersmallsymbols = 0;
        int counterbigsymbols = 0;
        int purchase = 0;
        for (char i ='a';i<='z';i++) {
            char symbol = console.nextLine().charAt(0);
            if ()
            if (symbol == i) {
                countersmallsymbols+=i;
                purchase++;
            }
        }
            countersmallsymbols*=0.5;
            for (char j ='A';j<='Z';j++){
                if (symbol == j){
                    counterbigsymbols+=j;
                    purchase++;
                }
            }
        }
    }

