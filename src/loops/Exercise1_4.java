package loops;

import java.util.ArrayList;

public class Exercise1_4 {

    public static void main(String[] args) {
        Double total = 0.0;
        ArrayList<Double> prices = new ArrayList<Double>();

        prices.add(4.50);
        prices.add(1.99);
        prices.add(9.75);
        prices.add(3.15);
        prices.add(10.25);

        for (Double price: prices) {
            total += price;
        }
        System.out.println(total);
    }
}
