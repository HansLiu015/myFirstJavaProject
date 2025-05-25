package uppgifterJava;

import java.util.Scanner;

public class uppgift37 {

    public static void main(String[] args) {

        /*37.Skapa ett program som läser in hur många tal användaren vill ange. Algoritmen ska sedan
             läsa in detta antal tal och skriva ut dem. */

        Scanner scan = new Scanner(System.in);
        int ArraySize;
        int x;

        System.out.print("How many numbers? ");
        ArraySize = scan.nextInt();

        int[] Array = new int[ArraySize];

        for (int i = 0; i < ArraySize; i++) {
            x = i+1;
            System.out.print("Enter number " + x + ": ");
            Array[i] = scan.nextInt();
        }

        for (int i = 0; i < ArraySize; i++) {
            System.out.print(Array[i] + " ");
        }
    }
}
