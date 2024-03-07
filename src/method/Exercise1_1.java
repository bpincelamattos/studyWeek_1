package method;

import java.util.Scanner;

public class Exercise1_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose a color");
        String color = scanner.nextLine();

        int points = getPoints(color);
        System.out.println("You’ve scored " + points + " points!");
    }

    public static int getPoints(String color){
        if (color.equals("green")){
           return 5;
        } else if (color.equals("red")) {
            return 10;
        } else if (color.equals("yellow")){
            return 15;
        }else{
            return 0;
        }
    }


}
