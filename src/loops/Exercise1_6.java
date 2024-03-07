package loops;

public class Exercise1_6 {

    public static void main(String[] args) {
        String numbsString = "10,7,25,3,8";
        int total = 0;

        String[] numbsArray = numbsString.split(",");

        for (String numb: numbsArray) {
            total += Integer.parseInt(numb);
        }
        System.out.println(total);

    }
}
