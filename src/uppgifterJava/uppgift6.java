package uppgifterJava;

import java.util.Scanner;

public class uppgift6 {

    public static void main(String[] args) {

        /*6. Skapa ett program som beräknar funktionen ax3 + 7 och skriver ut resultatet. Variablerna
             a och x ska läsas in. */

        double a;
        double x;
        double result;
        Scanner scan = new Scanner(System.in);

        System.out.println("ax3 + 7\n");

        System.out.print("Enter a value for \"a\": ");
        a = scan.nextDouble();

        System.out.print("Enter a value for \"x\": ");
        x = scan.nextDouble();

        result = a * x * 3 + 7;

        System.out.println("The result of the function \"ax3 + 7\" is " + result);
    }
}
