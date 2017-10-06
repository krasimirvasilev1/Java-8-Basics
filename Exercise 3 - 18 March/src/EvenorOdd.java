import java.util.Scanner;

/**
 * Created by Krasi on 3/18/2017.
 */
public class EvenorOdd {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double grade = Double.parseDouble(console.nextLine());
        if (grade % 2 == 0){ System.out.println("even");
        }else { System.out.println("odd");
    }
}
}