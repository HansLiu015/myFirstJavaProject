package uppgifterJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class uppgift39 {

    public static void main(String[] args) {

        /*39.Skapa ett program som läser in ett pris exkl moms och skriver ut priset inkl 25 % moms.
             Inläsningen ska pågå tills 0 anges. */

        List<Double> shoppingList = new ArrayList<Double>();
        Scanner scan = new Scanner(System.in);
        double price;
        double vat = 0.25;

        boolean zero = false;

        while (!zero) {
            System.out.print("Enter the price of an item (enter 0 to stop): ");
            price = scan.nextInt();
            if (price != 0) {
                price += price * vat;
                shoppingList.add(price);
            } else {
                zero = true;
            }
        }

        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.print(shoppingList.get(i) + " ");
        }
    }
}
