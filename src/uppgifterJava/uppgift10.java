package uppgifterJava;

import java.util.Scanner;

public class uppgift10 {

    public static void main(String[] args) {

        /*10.Sambandet mellan Fahrenheit och Celsius grader ges av formeln F=9C / 5 + 32.
             Skapa ett program där en temperatur i Fahrenheit läses in och motsvarande temperatur
             i Celsius skrivs ut. */

        double fahrenheit;
        double celsius;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a temperature (in Fahrenheit): ");
        fahrenheit = scan.nextDouble();

        celsius = (fahrenheit - 32) / 1.8;

        System.out.print(fahrenheit + " F is " + celsius + " C");
    }
}
