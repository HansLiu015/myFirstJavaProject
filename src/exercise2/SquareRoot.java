package exercise2;

import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {

        int a, b;
        double c;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the two sides of a triangle and I will calculate the hypotenuse of the triangle");
        System.out.print("Enter side a: ");
        a = Integer.parseInt(scan.nextLine());

        System.out.print("Enter side b: ");
        b = Integer.parseInt(scan.nextLine());

        c = Math.sqrt(a*a + b*b);

        System.out.println("The hypotenuse of the two sides is: " + c);
    }
}
