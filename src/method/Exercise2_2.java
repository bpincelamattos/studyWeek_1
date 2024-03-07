package method;

import java.util.Arrays;

public class Exercise2_2 {
    public static void main(String[] args) {

        String[] textArray = {"T", "C", "H", "A", "U"};
        String text = "TCHAU";
        System.out.println(containsArray(text, textArray));
    }

    public static boolean containsArray(String text, String[] textArray){
        String[] textArray2 = text.split("");
        return Arrays.equals(textArray2, textArray);
    }
}
