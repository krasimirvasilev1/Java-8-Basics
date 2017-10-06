import java.util.Scanner;

/**
 * Created by Krasi on 4/12/2017.
 */
public class Diamond1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer n = Integer.parseInt(console.nextLine());
        int odd = 1;
        int even = 2;
        if (n <= 2) {
            System.out.print(repeatstr("*", n));
        }
        if (n > 2 && n % 2 == 0) {
            System.out.printf("%s**%s%n", repeatstr("-", (n - 2) / 2), repeatstr("-", (n - 2) / 2));
            Integer starcount = 2;
            Integer sidedashes = (n - starcount) / 2;
            Integer middledasesh = 0;
            for (int i = 1; i < n / 2; i++) {
                System.out.printf("%s*%s*%s%n", repeatstr("-", sidedashes - 1), repeatstr("-", middledasesh += 2), repeatstr("-", sidedashes - 1));
sidedashes--;
            }for (int i = 1 ; i<n/2;i++){
                System.out.printf("%s*%s*%s%n",repeatstr("-",i),repeatstr("-",middledasesh-=2),repeatstr("-",i));
            }
        }
        else if (n>2 && n %2 == 1){
            System.out.printf("%s*%s%n", repeatstr("-", n / 2), repeatstr("-", n / 2));
            Integer starcount = 2;
            Integer sidedashes = (n - starcount) / 2;
            Integer middledasesh = 1;
            for (int i =1 ;i<=n/2;i++){
                System.out.printf("%s*%s*%s%n",repeatstr("-",sidedashes),repeatstr("-",middledasesh),repeatstr("-",sidedashes));
                sidedashes--;
                middledasesh+=2;}
            Integer starcount1 = 2;
            Integer sidedashes1 = 0;
            Integer middledasesh1 = n-starcount1;
                for (int i=1 ;i<n/2;i++){
                    System.out.printf("%s*%s*%s%n",repeatstr("-",sidedashes1+1),repeatstr("-",middledasesh1-2),repeatstr("-",sidedashes1+1));
                    sidedashes1++;
                    middledasesh1-=2;
                }
            System.out.printf("%s*%s%n", repeatstr("-", n / 2), repeatstr("-", n / 2));
        }
    }
    static String repeatstr (String strtorepeat ,int count){
        String text = "";
        for (int i = 0 ; i < count; i++) {
            text = text + strtorepeat ;
        }
        return text;
    }
}

