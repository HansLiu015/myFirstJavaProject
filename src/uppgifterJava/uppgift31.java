package uppgifterJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class uppgift31 {

    public static void main(String[] args) {

        /*31.Skapa ett program som läser in ett antal tal och skriver ut dem. Talföljdens slut
             markeras med 0. */

        List<Integer> numbers = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        int x;

        boolean zero = false;

        while (!zero) {
            System.out.print("Enter a number (enter 0 to stop): ");
            x = scan.nextInt();
            if (x != 0) {
                numbers.add(x);
            } else {
                zero = true;
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
