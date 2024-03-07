package loops;

public class Exercise2_7 {

    public static void main(String[] args) {
//        for (int i = 2; i <= 12; i++){
//          for (int j=1; j <= 12; j++){
//              System.out.println(i + " * " + j + " = " + i*j );
//
//          }
//        }
        for (int table = 2; table <=12; table++){
            System.out.println(table+" times table");

            for (int multiple = 1; multiple <=12; multiple++){
                int result = multiple * table;
                System.out.println(multiple+" x "+table+" = "+result);
            }

            System.out.println();
        }

    }
}
