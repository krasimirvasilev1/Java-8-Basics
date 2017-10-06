import java.util.Scanner;

/**
 * Created by Krasi on 3/18/2017.
 */
public class EqualWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String word = console.nextLine();
        String word1 = console.nextLine();
        word = word.toLowerCase();
        word1 = word1.toLowerCase();
            if (word.equals(word1)){
            System.out.println("yes");}
            else {
            System.out.println("no");}
    }
}

