package method;

import java.util.Scanner;

public class Exercise1_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a number: ");
        int numTimes = scanner.nextInt();

        displayTimesTable(numTimes);
    }

    public static void displayTimesTable(int number){
        for (int i = 1; i<=10; i++){
            System.out.println(i + " x " + number + " = " + i*number);
        }
    }
}
