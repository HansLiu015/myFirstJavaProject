package exceptionsPlants;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PlantList {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Program flow:");
        int list = 0, error = 0;
        String plantName, plantLocation, stopCheck;
        double plantHeight;
        Plant[] plants = new Plant[5];

        for (int i = 0; i < plants.length; i++) {
            try {
                System.out.print("Enter the name of the plant: ");
                stopCheck = scan.nextLine();

                if (stopCheck.equalsIgnoreCase("stop")) {
                    break;
                }
                plantName = stopCheck;

                System.out.print("Enter the plant height in meters: ");
                stopCheck = scan.nextLine();

                if (stopCheck.equalsIgnoreCase("stop")) {
                    break;
                }
                plantHeight = Double.parseDouble(stopCheck);

                System.out.print("Enter location: ");
                stopCheck = scan.nextLine();

                if (stopCheck.equalsIgnoreCase("stop")) {
                    break;
                }
                plantLocation = stopCheck;

                plants[i] = new Plant(plantName, plantHeight, plantLocation);
                list++;

                System.out.println();
            } catch (NumberFormatException nfe) {
                System.out.println();
                System.out.println("Please provide the correct height values in meters! (" + nfe + ")");
                i--;
                error++;
                System.out.println();
            } catch (Exception e) {
                System.out.println();
                System.out.println("Error occurred! Please try again. (" + e + ")");
                i--;
                error++;
                System.out.println();
            }
        }

        System.out.println();

        if (list < 1) {
            System.out.println("No plants were created.");
        } else {
            System.out.println("You created the following plants:");
            for (int i = 0; i < list; i++) {
                System.out.println("Name: " + plants[i].getName());
                System.out.println("Height: " + plants[i].getHeight());
                System.out.println("Location: " + plants[i].getLocation() + "\n");
            }
        }

        System.out.println("Total NumberFormatExceptions: " + error);

        scan.close();
    }
}
