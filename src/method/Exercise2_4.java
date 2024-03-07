package method;

import java.util.Arrays;

public class Exercise2_4 {

    public static void main(String[] args) {
        int[] numberArray = {-1, -5, -10};
        System.out.println(maxNumber(numberArray));
    }

    public static int maxNumber(int[] numberArray){
        return Arrays.stream(numberArray).max().getAsInt();
    }
}
