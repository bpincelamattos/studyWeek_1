package method;

import java.util.Arrays;

public class Exercise2_5 {
    public static void main(String[] args) {

        int[] numbersArray = {2,8,3,7,6,7,3,4,10};

        System.out.println(Arrays.toString(extractEvenArray(numbersArray)));

    }

    public static int[] extractEvenArray(int[] numbersArray){
        int arrayLength = 0;
        int i = 0;

        for (int numberArray: numbersArray) {
            if (numberArray%2 == 0){
                arrayLength++;
            }
        }
        int[] newArray = new int[arrayLength];
        for (int numberArray: numbersArray) {
            if (numberArray%2 == 0){
                newArray[i]=numberArray;
                i++;
            }
        }
        return newArray;
    }
}
