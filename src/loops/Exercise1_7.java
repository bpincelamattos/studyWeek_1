package loops;

import java.util.Arrays;

public class Exercise1_7 {

    public static void main(String[] args) {
        String text = "desrever neeb sah txet siht";

       char[] letters = text.toCharArray();

       String reversed = "";

        for (char letter: letters) {
            reversed = letter + reversed;
        }

        System.out.println(reversed);
    }
}
