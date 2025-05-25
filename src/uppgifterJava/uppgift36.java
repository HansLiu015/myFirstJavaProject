package uppgifterJava;

import java.util.Scanner;

public class uppgift36 {

    public static void main(String[] args) {

        /*36.Skapa ett program som räknar ut hur mycket man har på banken under vart och ett av de
             följande 10 åren om man sätter in 1000 kr. Räntan ska läsas in och är densamma för alla
             åren. */

        int year;
        int years = 10;
        int months = 12;
        int gain = 1000;
        double rent = 0.01;
        double earnings;
        double account = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a rent (in percent): ");
        rent *= scan.nextDouble();

        for (int i = 0; i < years; i++) {
            account += gain;
            earnings = account * rent * months;
            account += earnings;

            year = i+1;

            System.out.println("Money earned year " + year + ": " + account);
        }
    }
}
