package method;

import java.util.Arrays;

public class Exercise2_6 {

    public static void main(String[] args) {
        String[] textArray = {"O", "I"};

        System.out.println(Arrays.toString(reverseStringArray(textArray)));
    }

    public static String[] reverseStringArray(String[] textArray){
        String[] newArray = new String[textArray.length];
        for(int i=0; i < textArray.length; i++){
            newArray[i] = textArray[textArray.length-1-i];
        }
        return newArray;
    }
}
