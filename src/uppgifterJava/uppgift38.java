package uppgifterJava;

import java.util.Scanner;

public class uppgift38 {

    public static void main(String[] args) {

        /*38.En kommun har gjort följande prognos för befolkningsutvecklingen de närmaste åren: -
             Vid början av 2016 hade kommunen 26000 invånare.
                - Antalet födda och avlidna under ett år uppskattas var 0.7 % resp 0.6 % av
                  befolkningen vid årets början.
                - Antalet inflyttade och antalet utflyttade uppskattas till 300 resp 325 varje år.
             Skapa ett program som beräknar kommunens uppskattade invånarantal i början av ett visst
             år. Vilket år det gäller ska läsas in som indata till algoritmen. */

        Scanner scan = new Scanner(System.in);
        int population = 26000;
        int movedIn = 300;
        int movedOut = 325;
        int years;
        double born;
        double deaths;
        double bornPercentage = 0.007;
        double deathsPercentage = 0.006;

        System.out.println("This program calculates the expected population in a settlement at the start of a year.");

        System.out.print("Enter a year: ");
        int year = scan.nextInt();

        years = -(2016 - year);
        born = years * population * bornPercentage;
        deaths = years * population * deathsPercentage;

        if (years != 0) {
            population += born - deaths + years * (movedIn - movedOut);
        }

        System.out.print("The population of year " + year + " is expected to be " + population + " residents");
    }
}
