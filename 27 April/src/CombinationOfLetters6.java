import java.util.Scanner;

/**
 * Created by Krasi on 5/3/2017.
 */
public class CombinationOfLetters6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        char a = console.nextLine().charAt(0);
        char b = console.nextLine().charAt(0);
        char c = console.nextLine().charAt(0);
        int combinations = 0;
        char[] combinationArray = new char[4];
        combinationArray[3] = ' ';
        for (char i = a; i <= b; i++) {
            if (i != c) {
                combinationArray[0] = i;

                for (char j = a; j <= b; j++) {
                    if (j != c) {
                        combinationArray[1] = j;

                        for (char k = a; k <= b; k++) {
                            if (k != c) {
                                combinationArray[2] = k;

                                System.out.print(combinationArray);
                                combinations++;
                            }
                        }
                    }
                }
            }

        }
        System.out.println(combinations);
    }
}
