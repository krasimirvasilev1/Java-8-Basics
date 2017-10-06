import java.util.Scanner;

/**
 * Created by Krasi on 4/8/2017.
 */
public class SunGlasses {public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    int n = Integer.parseInt(console.nextLine());
    //Top
    System.out.print(repeatStr("*",2*n));
    System.out.print(repeatStr(" ",n));
    System.out.print(repeatStr("*",2*n));
    for (int i=0;i<n-2;i++){
        System.out.print("*");
        System.out.print(repeatStr("/",2*n-2 ));
        System.out.print("*");
        if ((n-1)/2-1 == 1){
            System.out.println(repeatStr("|", n));}
            else {
            System.out.println(repeatStr(" ", n));
            }
        System.out.print("*");
        System.out.print(repeatStr("/",2*n-2 ));
        System.out.print("*");
        }




    //Bottom
    System.out.print(repeatStr("*",2*n));
    System.out.print(repeatStr(" ",n));
    System.out.print(repeatStr("*",2*n));

}

    static String repeatStr (String strToRepeat, int count){
        String text = "";
        for (int i = 0;i<count;i++){
            text= text +strToRepeat;
        }
        return text;
    }
}

