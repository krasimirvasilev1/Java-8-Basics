import java.util.Scanner;

/**
 * Created by Krasi on 5/6/2017.
 */
public class EncodedAnswers2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer n =Integer.parseInt(console.nextLine());
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int all = 1;
        String result = "";
            for (int j = 1; j <=n;j++){
                Integer questions = Integer.parseInt(console.nextLine());
                if (questions%4 == 0){
                    result+="a ";
                    a++;
                }
                else if (questions%4 == 1){
                  result+="b ";
                    b++;
                }
                else if (questions%4 == 2){
                    result+= "c ";
                    c++;
                }
                else if (questions%4 == 3){
                    result+="d ";
                    d++;
                }

            }
        System.out.println(result);
        System.out.println("Answer A: "+a);
        System.out.println("Answer B: "+b);
        System.out.println("Answer C: "+c);
        System.out.println("Answer D: "+d);
    }
}
