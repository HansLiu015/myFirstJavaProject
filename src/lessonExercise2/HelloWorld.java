package lessonExercise2;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        HelloWorldPrinter hwp = new HelloWorldPrinter();

        Scanner scan = new Scanner(System.in);

        System.out.print("How many times? ");
        int amount = scan.nextInt();

        hwp.printer();

        hwp.printManyTimes(amount);
    }
}
