package uppgifterJava;

import java.util.Scanner;

public class uppgift9 {

    public static void main(String[] args) {

        /*9. Skapa ett program där en cirkels radie läses in. Cirkelns diameter, omkrets och area
             skall beräknas och skrivas ut. (pi = 3.14). */

        double radius;
        double diameter;
        double circumference;
        double area;
        double pi = 3.14;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the radius of an circle: ");
        radius = scan.nextDouble();

        diameter = radius * 2;
        circumference = radius * 2 * pi;
        area = pi * radius * radius;

        System.out.print("The circle has an diameter of " + diameter + " m, circumference of " + circumference);
        System.out.print(" m, and an area of " + area + " m^2");
    }
}
