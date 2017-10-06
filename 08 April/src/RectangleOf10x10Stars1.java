/**
 * Created by Krasi on 4/8/2017.
 */
public class RectangleOf10x10Stars1 {
    public static void main(String[] args) {
        String star = repeatStr("*", 5);
    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }

        return text;
    }
}