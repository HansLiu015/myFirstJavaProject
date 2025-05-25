package uppgifterJava;

import java.util.Scanner;

public class uppgift7 {

    public static void main(String[] args) {

        /*7. Skapa ett program som beräknar vad du ska betala för en tank bensin. Indata är antal
             , pris per liter och eventuell rabatt i procent. Utdata är priset som du ska betala */

        int amount;
        int cost;
        double toPercent = 0.01;
        double discount;
        double payment;
        Scanner scan = new Scanner(System.in);

        System.out.println("How many petrol tanks (1l): ");
        amount = scan.nextInt();

        System.out.println("How much does it cost/litre: ");
        cost = scan.nextInt();

        System.out.println("Whats the discount in percentage: ");
        discount = 1 - scan.nextDouble() * toPercent;

        payment = amount * cost * discount;

        System.out.println("The cost of the petrol tanks is: " + payment);
    }
}
