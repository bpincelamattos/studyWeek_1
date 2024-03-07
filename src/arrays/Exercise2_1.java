package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise2_1 {

    public static void main(String[] args) {

        ArrayList<String> shoppingBasket = new ArrayList<String>();

        shoppingBasket.add("milk");
        shoppingBasket.add("cereals");
        shoppingBasket.add("apple");
        shoppingBasket.add("oranges");
        shoppingBasket.add("bread");

        System.out.println(shoppingBasket.size());
        System.out.println(shoppingBasket.get(0));
        System.out.println(shoppingBasket.get(shoppingBasket.size()-1));

        shoppingBasket.remove(4);
        System.out.println(shoppingBasket.size());

        shoppingBasket.remove(2);
        System.out.println(shoppingBasket);

        shoppingBasket.add("potato");
        shoppingBasket.add("olive oil");
        shoppingBasket.add("chicken");

        Collections.sort(shoppingBasket);
        System.out.println(shoppingBasket.get(0));
        System.out.println(shoppingBasket.get(shoppingBasket.size()-1));
    }
}
