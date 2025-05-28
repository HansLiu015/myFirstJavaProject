package lessonExercise6;

import java.util.Scanner;

public class RandomNumberGuesser {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int min = 0;
        int max = 100;
        int range = max - min + 1;
        int rand = (int) (Math.random() * range) + min;
        int guess = -1;

        while (guess != rand) {
            System.out.print("Guess a number between 0-100: ");
            guess = Integer.parseInt(scan.nextLine());

            if (guess > rand) {
                System.out.println("Wrong! The number is lower!");
            } else if (guess < rand) {
                System.out.println("Wrong! The number is bigger!");
            }
        }

        System.out.println("You guessed correctly! The number was: " + rand);
        scan.close();
    }
}
