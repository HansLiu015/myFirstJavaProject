package testAutomationAssignment;

import java.util.Scanner;

public class MorseMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int errors = 0;
        boolean noError = false;

        MorseLogic text = new MorseLogic();

        while (!noError) {
            try {
                System.out.print("Your input: ");

                String input = scan.nextLine();

                if (text.checkInput(input).equals("morse")) {
                    text.decipherMorse(input);

                    System.out.println("Your input to text: " + text.getOutput());
                } else if (text.checkInput(input).equals("text")) {
                    text.encryptText(input);

                    System.out.println("Your input to morse: " + text.getOutput());
                }
                noError = true;
            } catch (NullPointerException npe) {
                System.out.println("Please enter using only alfabet or the international morse code!");
                errors++;
            } catch (Exception e) {
                System.out.println("An error occurred. Please try again!" + e);
                errors++;
            }
        }

        System.out.println("\nThe program ended with " + errors + " errors");

        scan.close();
    }
}
