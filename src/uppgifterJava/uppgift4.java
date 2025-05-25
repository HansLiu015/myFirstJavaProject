package uppgifterJava;

import java.util.Scanner;

public class uppgift4 {

    public static void main(String[] args) {
        /*4. Skapa ett program som läser in tre tal och beräknar och skriver ut summan samt medelvärdet
             av de tre talen. */

        int arraySize = 3;
        int[] numbers = new int[arraySize];
        int sum = 0;
        double mean;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arraySize; i++) {
            if (i > 0) {
                System.out.print("Enter another number: ");
                numbers[i] = scan.nextInt();
            } else {
                System.out.print("Enter a number: ");
                numbers[i] = scan.nextInt();
            }
            sum += numbers[i];
        }

        mean = (double) sum / arraySize;

        System.out.print("The sum of the numbers are " + sum + " and the average is " + mean);
    }
}
