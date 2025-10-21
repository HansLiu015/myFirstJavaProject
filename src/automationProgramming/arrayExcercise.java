package automationProgramming;

import java.util.Scanner;

public class arrayExcercise {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("How many names? ");
        int amount = Integer.parseInt(scan.nextLine());

        String[] listOfNames = new String[amount];

        for (int i = 0; i < listOfNames.length; i++) {
            System.out.print("Enter a name: ");

            listOfNames[i] = scan.nextLine();

            System.out.println(listOfNames[i] + " added!");
        }

//        for (int i = 0; i < listOfNames.length; i++) {
//            System.out.println(listOfNames[i]);
//        }

        System.out.println("The first name is: " + listOfNames[0]);
        System.out.println("The last name is: " + listOfNames[listOfNames.length-1]);

        System.out.print("Enter a sentence: ");
        String sentence = scan.nextLine();

        String[] wordCounter = sentence.split(" ");

        System.out.println("Your sentence contains " + wordCounter.length + " word(s)");

        scan.close();
    }
}
