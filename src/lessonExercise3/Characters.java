package lessonExercise3;

import java.util.Scanner;

public class Characters {

    public static void main(String[] args) {
        Spellchecker spell = new Spellchecker();

        if (spell.isLetter('a')) {
            System.out.println("a is a letter");
        }

        if (spell.isLetter('H')) {
            System.out.println("H is a letter");
        }

        if (spell.isLetter('h')) {
            System.out.println("h is a letter");
        }

        if (spell.isLetter('å')) {
            System.out.println("å is a letter");
        }

        if (spell.isLetter('4')) {
            System.out.println("4 is a letter");
        }

        if (spell.isLetter('%')) {
            System.out.println("% is a letter");
        }
    }
}
