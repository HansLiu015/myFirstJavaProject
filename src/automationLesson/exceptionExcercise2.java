package automationLesson;

import java.util.Scanner;

public class exceptionExcercise2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] division = new double[2];
        double div = 0;

        boolean correct = false;

        while (!correct) {
            try {
                System.out.print("Enter the first number: ");
                division[0] = Integer.parseInt(scan.nextLine());
                correct = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter an integer! " + e);
            } catch (Exception e) {
                System.out.println("System error! " + e);
            }
        }

        correct = false;

        while (!correct) {
            try {
                System.out.print("Enter the second number: ");
                division[1] = Integer.parseInt(scan.nextLine());
                div = division[0] / division[1];
                if (division[1] != 0) {
                    correct = true;
                } else {
                    System.out.println("You cannot divide by zero!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter an integer! " + e);
            } catch (ArithmeticException e) {
                System.out.println("You cannot divide by zero! " + e);
            } catch (Exception e) {
                System.out.println("System error! " + e);
            }
        }

        System.out.println(division[0] + " / " + division[1] + " = " + div);

        scan.close();
    }
}
