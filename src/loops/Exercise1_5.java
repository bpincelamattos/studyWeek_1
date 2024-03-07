package loops;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise1_5 {

    public static void main(String[] args) {
        Double[] prices2 = new Double[5];
        ArrayList<Double> prices = new ArrayList<Double>();

        prices.add(4.50);
        prices.add(1.99);
        prices.add(9.75);
        prices.add(3.15);
        prices.add(10.25);

        int index = 0;

        for (Double price: prices) {
            prices2[index] = price;
            index++;
        }
        System.out.println(Arrays.toString(prices2));
    }
}
