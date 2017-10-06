import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Krasi on 3/22/2017.
 */
public class Pipe {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        Integer v = Integer.parseInt(console.nextLine());
        Integer p1 = Integer.parseInt(console.nextLine());
        Integer p2 = Integer.parseInt(console.nextLine());
        Double n = Double.parseDouble(console.nextLine());
        double pipe1 = p1*n;
        double pipe2 = p2*n;
        double pipe3 = pipe1+pipe2;
        double additional = pipe3 - v;
        double full =(pipe3/v)*100;
        double help1 = (pipe1/pipe3)*100;
        double help2 = (pipe2/pipe3)*100;
        if (pipe3>v){
            DecimalFormat format = new DecimalFormat("#.####");
            System.out.printf("For %s hours the pool overflows with %s liters.", format.format(n), format.format(additional));}
            else{
            System.out.println("The pool is "+(int)full+"% full. "+"Pipe 1: "+(int)help1+"%. "+"Pipe 2: "+(int)help2+"%.");}



    }
}
