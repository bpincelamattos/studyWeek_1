package loops;

import java.util.Arrays;

public class Exercise2_5 {

    public static void main(String[] args) {

        int[] scores = {25, 15,99,75,47,59,82};

        for (int i = 1; i< scores.length; i+=2){
            scores[i]++;
        }
        System.out.println(Arrays.toString(scores));

        for (char letter = 'b'; letter <= 'z'; letter +=2){
            System.out.println(letter);
        }

    }

}
