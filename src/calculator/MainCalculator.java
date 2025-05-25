package calculator;

import java.util.Scanner;

public class MainCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //System.out.print("Enter the first number: ");
        //int num1 = scan.nextInt();

        //System.out.print("Enter the second number: ");
        //int num2 = scan.nextInt();

        System.out.print("Enter two numbers: ");
        Calculator calc = new Calculator(scan.nextInt(), scan.nextInt());

        System.out.println("The sum of the numbers are: " + calc.getSum());

        System.out.println("The subtraction of the numbers are: " + calc.getSub());

        System.out.println("The product of the numbers are: " + calc.getMult());

        System.out.println("The quotient of the numbers are: " + calc.getDiv());
    }
}
