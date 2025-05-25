package uppgifterJava;

import java.util.Scanner;

public class uppgift8 {

    public static void main(String[] args) {

        /*8. Skapa ett program som beräknar och skriver ut arean och omkretsen av en rektangel.
             Rektangelns sidor ska läsas in. */

        double a;
        double b;
        double rectangle;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter side a: ");
        a = scan.nextDouble();

        System.out.print("Enter side b: ");
        b = scan.nextDouble();

        rectangle = a * b;

        System.out.println("The area of the rectangle is: " + rectangle + " m^2");
    }
}
