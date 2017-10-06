import java.util.Scanner;
public class valko {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int secs1 = Integer.parseInt(console.nextLine());
        int secs2 = Integer.parseInt(console.nextLine());
        int secs3 = Integer.parseInt(console.nextLine());
        int secs = secs1 + secs2 + secs3;
        int mins = 0;

        if (secs1 > 59)
        {mins++;secs = secs -60;}
        else if (secs2 >59)
        {mins++ ; secs = secs -60;}
        else if (secs3 >59)
        {mins++ ; secs = secs -60;}
        if (secs < 10) {
            System.out.println(mins + ":" + "0" + secs);
        } else {
            System.out.println(mins + ":" + secs);
        }
    }
}
