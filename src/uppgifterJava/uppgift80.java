package uppgifterJava;

import java.util.Scanner;

public class uppgift80 {

    public static void main(String[] args) {

        //80.Skapa ett program som läser in siffrorna i ett bråk till en array med två platser. Algoritmen ska se till
        //att bråket förkortas så långt som möjligt.
        //Ex: Om siffrorna i bråket är 6 och 12 ska det lagras i arrayn som 1 och 2
        //Tips: Ta reda på SGD (Största gemensamma divisor). I exemplet är SGD 6

        Scanner scan = new Scanner(System.in);

        int first;
        int second;

        System.out.print("Enter first number: ");
        first = scan.nextInt();

        System.out.print("Enter second number: ");
        second = scan.nextInt();

        uppgift80Div fraction = new uppgift80Div(first, second);

        if (fraction.getDenominator() == 0) {
            System.out.println("The second number can't be 0!");
        } else {
            fraction.abbreviateFraction();
            System.out.print("The fraction is: " + fraction.getNumerator() + "/" + fraction.getDenominator());
            System.out.println(" and the greatest common divisor is: " + fraction.getGcd());
        }
    }
}
