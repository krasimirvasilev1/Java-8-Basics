import java.util.Scanner;

/**
 * Created by Krasi on 4/1/2017.
 */
public class VowelsSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String word = console.nextLine().toLowerCase();
        int sum = 0;
        for (int i = 0; i <= word.length()-1; i++) {
            char letter = word.charAt(i);
            switch(letter){
                case 'a':
                    sum+=1;
                    break;
                case 'e':
                    sum+=2;
                    break;
                case 'i':
                    sum+=3;
                    break;
                case 'o':
                    sum+=4;
                    break;
                case 'u':
                    sum+=5;
                    break;
                }
        }
        System.out.println(sum);
        }
        }

