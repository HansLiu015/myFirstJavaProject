package exercise3;

import java.util.Scanner;

public class Simpsons {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        SimpsonsCatchphrases character = new SimpsonsCatchphrases();

        System.out.print("Enter the name of a Simpsons character: ");
        String name = scan.nextLine();

        character.getCatchphrase(name);

        scan.close();
    }
}
