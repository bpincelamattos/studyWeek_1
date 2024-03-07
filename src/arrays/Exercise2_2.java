package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise2_2 {

    public static void main(String[] args) {

        ArrayList<Integer> salaries = new ArrayList<Integer>();

        salaries.add(75000);
        salaries.add(25000);
        salaries.add(42000);
        salaries.add(30000);
        salaries.add(55000);
        salaries.add(42000);
        salaries.add(39000);

        System.out.println(Collections.max(salaries));
        System.out.println(Collections.min(salaries));
        Collections.sort(salaries);
        System.out.println(salaries);
        System.out.println(salaries.get(3));
        Collections.reverse(salaries);
        System.out.println(salaries);
        System.out.println(salaries.get(0));
        System.out.println(salaries.get(salaries.size()-1));

    }
}
