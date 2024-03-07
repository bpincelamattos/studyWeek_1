package conditionals;

import java.util.Scanner;

public class Exercise2_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your account number");
        int accountNumber = scanner.nextInt();

        if (accountNumber < 10000000 || accountNumber > 99999999){
            System.out.println("Invalid Account Number");
        } else {
            System.out.println("Valid Account Number");
        }

    }
}
