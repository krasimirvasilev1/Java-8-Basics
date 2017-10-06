import java.util.Scanner;

/**
 * Created by Krasi on 4/17/2017.
 */
public class PreparingTheTitles {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        Integer ploshtatka = Integer.parseInt(console.nextLine());
        Double shirochinaplochka = Double.parseDouble(console.nextLine());
        Double duljinaplochka = Double.parseDouble(console.nextLine());
        Integer shirochinapeika = Integer.parseInt(console.nextLine());
        Integer duljinapeika = Integer.parseInt(console.nextLine());
        Integer area = ploshtatka*ploshtatka;
        Integer cleararea = area - (shirochinapeika*duljinapeika);
        Double sizeplochka = shirochinaplochka*duljinaplochka;
        Double numplochka = cleararea/sizeplochka;
        System.out.println(numplochka);
        System.out.println(numplochka*0.2);
    }
}
