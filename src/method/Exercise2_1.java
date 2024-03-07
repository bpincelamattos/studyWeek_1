package method;

import java.util.Scanner;

public class Exercise2_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type an year: ");
        int year = scanner.nextInt();

        System.out.println(leapYear(year));

    }

    public static boolean leapYear (int year){
        if (year%4 != 0){
            return false;
        }
        if (year%400 == 0){
            return true;
        }
        if (year%100 == 0){
            return false;
        }
        return true;
    }
}
