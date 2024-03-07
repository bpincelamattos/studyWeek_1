package conditionals;

import java.util.Scanner;

public class Exercise1_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your age? ");
        int age = scanner.nextInt();


        if (age < 2){
            System.out.println("You are a baby");
        } else if(age < 4){
            System.out.println("You are a toddler");
        } else if (age < 13){
            System.out.println("You are a child");
        } else if (age < 20){
            System.out.println("You are a teenager");
        } else if (age < 65){
            System.out.println("You are a working age adult");
        } else {
            System.out.println("You are an pensioner");
        }

    }
}
