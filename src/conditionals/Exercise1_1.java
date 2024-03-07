package conditionals;

public class Exercise1_1 {

    public static void main(String[] args) {
        String alienColor = "purple";

        if (alienColor.equals("green")){
            System.out.println("You earned 5 points");
        } else if (alienColor.equals("red")) {
            System.out.println("You earned 10 points");
        } else if (alienColor.equals("yellow")){
            System.out.println("You earned 15 points");
        }else{
            System.out.println("Invalid color");
        }
    }


}
