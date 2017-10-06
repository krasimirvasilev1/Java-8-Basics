import java.util.Scanner;

/**
 * Created by Krasi on 5/7/2017.
 */
public class NumGenerator6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer M = Integer.parseInt(console.nextLine());
        Integer N = Integer.parseInt(console.nextLine());
        Integer L = Integer.parseInt(console.nextLine());
        Integer specialnum = Integer.parseInt(console.nextLine());
        Integer controlnum = Integer.parseInt(console.nextLine());
        int add = specialnum;
        for (int i = M; i >= 1; i--) {
            for (int j = N; j >= 1; j--) {
                for (int k = L; k >= 1; k--) {
                    if ((i * 100 + j * 10 + k ) % 3 == 0) {
                        add += 5;
                    } else if ((i * 100 + j * 10 + k) % 10 == 5) {
                        add -= 2;
                    } else if ((i * 100 + j * 10 + k) % 2 == 0) {
                        add *= 2;
                    }
                    if (add >= controlnum) {
                        break;
                    }
                }
                if (add >= controlnum) {
                    break;
                }
            }
            if (add >= controlnum) {
                break;
            }
        }
        if (add>=controlnum){
            System.out.println("Yes! Control number was reached! Current special number is "+add+".");
        }
        else{
            System.out.println("No! "+add+" is the last reached special number.");
        }
    }
}
