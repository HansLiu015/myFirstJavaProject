package automationProgramming;

import java.util.Scanner;

public class exceptions {

    public static void main(String[] args) {

        //Fibonacci
        Scanner scan = new Scanner(System.in);

        boolean incorrectInt = true;

        while (incorrectInt) {
            try {
                System.out.print("Enter the order of fibonacci you want: ");
                int number = Integer.parseInt(scan.nextLine());
                int[] fibonacci = new int[40];

                fibonacci[0] = 1;
                fibonacci[1] = 1;

                for (int i = 2; i < 40; i++) {
                    fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
                }

                System.out.println("This corresponds to: " + fibonacci[number - 1]);

                incorrectInt = false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Please enter a positive integer between 1-40");
            } catch (NumberFormatException e) {
                System.out.println("Please enter a positive integer!");
            } catch (Exception e) {
                System.out.println("Something went wrong. Please try again!");
            }
        }

        scan.close();
    }
}
