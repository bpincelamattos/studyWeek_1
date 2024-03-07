package conditionals;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise2_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the flight code: ");
        String flightCode = scanner.next();

        if (flightCode.startsWith("BA")) {
            System.out.println("British Airways");
        } else {
            System.out.println("Not British Airways");
        }

    }
}
