package introduktionProgrammeringInlamning;

import java.util.Scanner;

public class WordTyper {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        WordCounter words = new WordCounter();

        //loops the program until the user types "stop"
        while (!words.stop()) {
            words.increment(scan.nextLine());
        }

        System.out.println("Amount of rows: " + words.getRowCount());
        System.out.println("Amount of words: " + words.getWordCount());
        System.out.println("Amount of characters: " + words.getCharacterCount());
        System.out.println("Longest word: " + words.getLongestWord());

        scan.close();
    }
}
