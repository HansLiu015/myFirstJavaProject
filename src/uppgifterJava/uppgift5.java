package uppgifterJava;

import java.util.Scanner;

public class uppgift5 {

    public static void main(String[] args) {

        /*5. Läs in ett heltal motsvarande svenska kronor och skriv ut motsvarande värde i pund
             respektive dollar. Antag att kursen är : 1 dollar = 6 kr, 1 pund = 10 kr. */

        int kronor;
        double pound;
        double dollar;
        double poundWorth = 10;
        double dollarWorth = 6;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an amount of money in kronor: ");
        kronor = scan.nextInt();

        dollar = kronor / dollarWorth;
        pound = kronor / poundWorth;

        System.out.print("The amount of kronor corresponds to " + dollar + " dollars and " + pound + " pounds");
    }
}
