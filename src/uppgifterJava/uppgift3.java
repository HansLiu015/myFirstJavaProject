package uppgifterJava;

import java.util.Scanner;

public class uppgift3 {

    public static void main(String[] args) {

        /*3. Skapa ett program som läser in antal timmar, beräknar och skriver ut hur mycket det
             blir omvandlat till minuter resp sekunder. */

        int hours;
        int minutes;
        int seconds;
        String temp = "hours";

        System.out.print("Enter how many hours: ");
        Scanner scan = new Scanner(System.in);
        hours = scan.nextInt();

        if (hours == 1) {
            temp = "hour";
        }

        minutes = hours * 60;
        seconds = minutes * 60;

        System.out.print(hours + " " + temp + " is " + minutes + " minutes");
        System.out.print(" and " + seconds + " seconds");
    }
}
