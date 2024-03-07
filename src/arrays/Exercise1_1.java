package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise1_1 {
    public static void main(String[] args) {
        
        String[] friends = {"Marcela", "Mariana", "Tayna", "Stefanie", "Lilian"};

        System.out.println(friends.length);

        for (int i = 0; i < friends.length; i++){
            System.out.println(friends[i]);
        }

        friends[4] = "Camilla";
        System.out.println(Arrays.toString(friends));

        Arrays.sort(friends);
        System.out.println(Arrays.toString(friends));

        System.out.println(friends[0]);
        System.out.println(friends[friends.length-1]);

        friends[1] = null;
        System.out.println(Arrays.toString(friends));

    }
}
