package exercise3;

import java.util.Scanner;

public class PokemonNames {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String letter = scan.nextLine();

        switch (letter) {
            case "a":
                System.out.println("Aerodactyl");
                break;
            case "b":
                System.out.println("Bulbasaur");
                break;
            case "c":
                System.out.println("Chansey");
                break;
            case "d":
                System.out.println("Diglett");
                break;
            default:
                System.out.println("Error! No Pokemon found for the following letter: " + letter);
        }
    }
}
