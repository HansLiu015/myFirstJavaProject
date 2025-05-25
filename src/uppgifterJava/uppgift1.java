package uppgifterJava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class uppgift1 {

    public static void main(String[] args) {

        /*1. Skapa ett program som skriver ut kvadraten på ett tal som läses in. Kvadrat är talet
             multiplicerat med sig själv*/

//        int number;
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Skriv ett heltal: ");
//        number = scan.nextInt();
//
//        int square = number*number;
//
//        System.out.println("Kvadraten av " + number + " är: " + square);

        //11.Skapa ett program där två tal läses in och det första talet skrivs ut om det är störst.

        int first;
        int second;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        first = scan.nextInt();
        System.out.print("Enter another number: ");
        second = scan.nextInt();

        if (first > second) {
            System.out.println(first);
        }
    }
}
