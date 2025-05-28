package lessonExercise7;

import java.util.Scanner;

public class Seasons {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a month: ");
        String month = (scan.nextLine()).toLowerCase();

        switch (month) {
            case "january":
                System.out.println("Winter");
                break;
            case "february":
                System.out.println("Winter");
                break;
            case "mars":
                System.out.println("Spring");
                break;
            case "april":
                System.out.println("Spring");
                break;
            case "may":
                System.out.println("Spring");
                break;
            case "june":
                System.out.println("Summer");
                break;
            case "july":
                System.out.println("Summer");
                break;
            case "august":
                System.out.println("Summer");
                break;
            case "september":
                System.out.println("Fall");
                break;
            case "october":
                System.out.println("Fall");
                break;
            case "november":
                System.out.println("Fall");
                break;
            case "december":
                System.out.println("Winter");
                break;
            default:
                System.out.println(month + " is not a month!");
                break;
        }

        scan.close();
    }
}
