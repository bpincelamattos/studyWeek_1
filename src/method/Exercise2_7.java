package method;

import java.util.Arrays;

public class Exercise2_7 {

    public static void main(String[] args) {

        String word1 = "home";
        String word2 = "secure";

        System.out.println(isAnagram(word1, word2));
    }

    public static boolean isAnagram(String word1, String word2){

        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);

    }
}
