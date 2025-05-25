package uppgifterJava;

import java.util.Scanner;

public class uppgift29 {

    public static void main(String[] args) {

        /*29.Skapa ett program som beräknar ankomsttiden för ett tåg. I inmatningsrutan finns
             följande:
             tidpunkt i timma och minut för avgången (t ex 12 41)
             körtid i timma och minut (t ex 3 47)
             I utmatningsrutan ska klockslaget för ankomsttiden skrivas. Om midnatt passeras ska det
             även skrivas “NÄSTA DAG“ i utmatningsrutan. */

        Scanner scan = new Scanner(System.in);
        int hoursD;
        int minutesD;
        int hoursL;
        int minutesL;
        int hoursA;
        int minutesA;
        boolean nextDay = false;
        String departure;
        String length;
        String arrival;
        String next = "NEXT DAY";
        String[] departureTime;
        String[] lengthTime;

        System.out.println("Welcome! This program calculates the arrival time of trains.\n" +
                            "\nPlease input the time according to the following format in hours and minutes (HH MM)\n");

        System.out.print("Enter the time of departure: ");
        departure = scan.nextLine();
        departureTime = departure.split(" ");
        hoursD = Integer.parseInt(departureTime[0]);
        minutesD = Integer.parseInt(departureTime[1]);

        System.out.print("Enter the travel length: ");
        length = scan.nextLine();
        lengthTime = length.split(" ");
        hoursL = Integer.parseInt(lengthTime[0]);
        minutesL = Integer.parseInt(lengthTime[1]);

        hoursA = hoursD + hoursL;
        minutesA = minutesD + minutesL;

        if (minutesA >= 60) {
            minutesA -= 60;
            hoursA++;
        }
        if (hoursA >= 24) {
            hoursA -= 24;
            nextDay = true;
        }

        if (hoursA < 10 && minutesA < 10) {
            arrival = "0" + hoursA + " " + "0" + minutesA;
        } else if (hoursA < 10 && minutesA >= 10) {
            arrival = "0" + hoursA + " " + minutesA;
        } else if (hoursA >= 10 && minutesA < 10) {
            arrival = hoursA + " " + "0" + minutesA;
        } else {
            arrival = hoursA + " " + minutesA;
        }

        if (!nextDay) {
            System.out.println("\nYour train arrives " + arrival + " o'clock");
        } else {
            System.out.println("\nYour train arrives " + arrival + " o'clock " + next);
        }
    }
}
