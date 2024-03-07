package dataTypes;

public class Exercise3_1 {

    public static void main(String[] args) {
        //Create a char called letter and give it the value of ‘a’.
        char letter = 'a';

        //Create an int called code and give it the value of 98.
        int code = 98;

        //Display the value of the letter variable cast to an int (should be 97)
        System.out.println((int) letter); //widening cast -> converting a smaller type to a larger type size
        //Display the value of the code variable cast to a char (should be ‘b’)
        System.out.println((char) code); //Narrowing Casting -> converting a larger type to a smaller size type
        //Display the value of the number 36 cast to a char (should be a $)
        System.out.println((char) 36);


    }
}
