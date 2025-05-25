package uppgifterJava;

import java.util.Scanner;

public class uppgift34 {

    public static void main(String[] args) {

        /*34.Skapa ett program som läser in och skriver ut ett tecken i taget tills en * skrivs in. */

        Scanner scan = new Scanner(System.in);
        String input = "";

        while (!input.contains("*")) {
            System.out.print("Enter a character (\"*\" to stop): ");
            input = scan.next();
            System.out.println("You entered: " + input);

            if (input.contains("*")) {
                System.out.println("\nThe program will now stop.");

                System.out.println("Uppgift 35: ");
                for (int i = 1; i < 10; i++) {
                    System.out.print(i*i + " ");
                }
            }
        }
    }
}
