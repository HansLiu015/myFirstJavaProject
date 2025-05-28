package lessonExercise7;

import java.util.Scanner;

public class Seasons {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a month: ");
        String month = (scan.nextLine()).toLowerCase();

        switch (month) {
            case "january", "february", "december":
                System.out.println("Winter");
                break;
            case "mars", "april", "may":
                System.out.println("Spring");
                break;
            case "june", "july", "august":
                System.out.println("Summer");
                break;
            case "september", "october", "november":
                System.out.println("Fall");
                break;
            default:
                System.out.println(month + " is not a month!");
                break;
        }

        scan.close();
    }
}
