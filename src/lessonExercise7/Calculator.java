package lessonExercise7;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Logic calculator = new Logic();

        System.out.print("Enter the first number: ");
        int first = Integer.parseInt(scan.nextLine());

        System.out.print("Enter the second number: ");
        int second = Integer.parseInt(scan.nextLine());

        System.out.print("Choose an operator (+ - * /): ");
        String operator = scan.nextLine();

        int result = calculator.operators(operator, first, second);

        System.out.println(first + " " + operator + " " + second + " = " + result);

        scan.close();
    }
}
