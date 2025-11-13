package automationLesson;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionExcercise3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number;
        String input = "";
        int errors = 0;
        boolean stop = false;
        boolean end = false;

        int[] numList = new int[5];

        while (!end) {
            for (int i = 0; i < numList.length; i++) {
                try {
                    System.out.print("Enter a number: ");
                    number = scan.nextInt();
                    numList[i] = number;
                    System.out.println("Added number \"" + number + "\" succesfully to the list!");
                    end = true;
                } catch (InputMismatchException ime) {
                    System.out.println("Please enter a number! (" + ime + ")");
                    i--;
                    errors++;
                    scan.nextLine();
                } catch (ArrayIndexOutOfBoundsException aiobe) {
                    System.out.println("Please enter a positive integer! (" + aiobe + ")");
                    i--;
                    errors++;
                    scan.nextLine();
                } catch (Exception e) {
                    System.out.println("Critical error occurred! Try again. (" + e + ")");
                    i--;
                    errors++;
                    scan.nextLine();
                }
            }
        }

        scan.nextLine();

        while (!stop) {
            try {
                System.out.print("Which number would you like to see? (Enter \"stop\" to terminate the program) ");
                input = scan.nextLine();
                if (input.equals("stop")) {
                    stop = true;
                } else {
                    number = Integer.parseInt(input);
                    System.out.println(numList[number-1]);
                }
            } catch (ArrayIndexOutOfBoundsException aiobe) {
                System.out.println("Please enter a number between 1-5! (" + aiobe + ")");
                errors++;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter a positive integer! (" + nfe + ")");
                errors++;
            } catch (Exception e) {
                System.out.println("Critical error occurred! (" + e + ")");
                errors++;
            }
        }

        System.out.println("Amount of errors occurred: " + errors);

        scan.close();
    }
}
