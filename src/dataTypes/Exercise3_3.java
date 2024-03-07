package dataTypes;

public class Exercise3_3 {

    public static void main(String[] args) {
        //Create a char called char1 and give it the value ‘x’
        char char1 = 'x';
        //Create a char called char2 and give it the value ‘y’
        char char2 = 'y';
        //Create a char called char3 and give it the value ‘z’
        char char3 = 'z';

        //Create a String called string1 and give it the value “z”
        String string1 = "z";
        //Create a String called string2 and give it the value “y”
        String string2 = "y";

        System.out.println(char1 + char2 + char3); //Adding 2 consecutive chars gives the sum of their Unicode values
        System.out.println(char1 + char2 + string2);//Adding a char and a String creates a new String containing the characters from both
        System.out.println(char1 + string1 + char3);//Adding a char and a String creates a new String containing the characters from both
    }
}
