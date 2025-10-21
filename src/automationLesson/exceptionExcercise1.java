package automationLesson;

import java.util.Scanner;

public class exceptionExcercise1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] names = {"Ada", "Beda", "Cålle"};

        boolean correct = false;

        int num = 0;

        while (!correct) {
            try {
                correct = true;
                System.out.print("Enter a number to write out the name: ");
                num = Integer.parseInt(scan.nextLine());
                System.out.println(names[num - 1]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Please enter a positive integer between 1-3");
                correct = false;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a positive integer!");
                correct = false;
            } catch (Exception e) {
                System.out.println("System error!");
                correct = false;
            }
        }

        scan.close();
    }
}
