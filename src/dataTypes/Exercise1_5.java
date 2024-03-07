package dataTypes;

public class Exercise1_5 {

    public static void main(String[] args){

        String sentence = "this is a sentence";

        //Display the position of the first space (should be 4)
        System.out.println(sentence.indexOf(" "));
        //Display the position of the last space (should be 9)
        System.out.println(sentence.lastIndexOf(" "));
        //Display the position of the first letter x (should be -1)
        System.out.println(sentence.indexOf("x"));
        //Display the first 4 characters of the String (should show “this”)
        System.out.println(sentence.substring(0,4));
        //Display the characters of the String from position 10 onwards (should show “sentence”)
        System.out.println(sentence.substring(10));
        //Display the characters in positions 5,6,7 & 8 (should show “is a”)
        System.out.println(sentence.substring(5,9));
        //Does the sentence contain the letter “a”? Display true or false.
        System.out.println(sentence.contains("a"));
        //Does the sentence contain the letter “x”? Display true or false.
        System.out.println(sentence.contains("x"));
        //Add the text “is “ to the start of the String and “?” to the end of the String
        System.out.println("is " + sentence + "?");
        //Replace the first letter “t” with the letter “T” and display the new value of the String
        System.out.println(sentence.replaceFirst("t", "T"));

    }
}
