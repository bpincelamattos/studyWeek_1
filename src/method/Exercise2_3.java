package method;

public class Exercise2_3 {

    public static void main(String[] args) {

        int[] arrayFrequency = {0, 1, 2, 3, 4, 2, 4, 2};
        int number = 7;

        System.out.println(arrayFrequency(arrayFrequency,number));

    }

    public static int arrayFrequency(int[] numbersArray, int number){
        int frequency = 0;
        for (int numberArray : numbersArray) {
            if (numberArray == number){
                frequency += 1;
            }
        }
        return frequency;
    }
}
