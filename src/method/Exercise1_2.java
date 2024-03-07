package method;

import java.util.Scanner;

public class Exercise1_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose a number");
        int number = scanner.nextInt();

        long result = sumOfNumbersUpTo(number);
        System.out.println(result);

    }

    public static long sumOfNumbersUpTo (int x) {
        long total = 0;
        for (int i = 1; i <= x; i++){
            total +=i;
        }
        return total;
    }
}
