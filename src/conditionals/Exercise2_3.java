package conditionals;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise2_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the flight code: ");
        String flightCode = scanner.next();

//        WITH SWITCH STATEMENT - EXTRA EXERCISE
//        switch (flightCode.substring(0, 2)) {
//            case "LH" -> System.out.println("Lufthansa");
//            case "BA" -> System.out.println("British Airways");
//            case "FR" -> System.out.println("Ryanair");
//            default -> System.out.println("Invalid Airline");
//        }

//        EXERCISE 2.3
//        if (flightCode.startsWith("LH") || flightCode.startsWith("BA") || flightCode.startsWith("FR") ){
//            System.out.println("Valid Airline");
//        } else {
//            System.out.println("Invalid Airline");
//        }

//      EXERCISE 2.4
        if (!(flightCode.startsWith("LH") || flightCode.startsWith("BA") || flightCode.startsWith("FR"))){
            System.out.println("Invalid Airline");
        }
    }
}
