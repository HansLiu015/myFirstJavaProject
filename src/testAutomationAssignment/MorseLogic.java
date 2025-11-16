package testAutomationAssignment;

import java.util.HashMap;

public class MorseLogic {

    private String alfabet, morse;
    private String output = "";
    private String[] alfaArray, morseArray;

    private HashMap<String, String> toMorse = new HashMap<>();
    private HashMap<String, String> toText = new HashMap<>();

    public MorseLogic() {
        this.alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        this.morse = ".- -... -.-. -.. . ..-. --. .... .. .--- -.- .-.. -- -. --- .--. --.- .-. ... - ..- ...- .-- -..- -.-- --..";
        this.alfaArray = alfabet.split("");
        this.morseArray = morse.split(" ");

        for (int i = 0; i < alfaArray.length; i++) {
            this.toMorse.put(alfaArray[i], morseArray[i]);
            this.toText.put(morseArray[i], alfaArray[i]);
        }
    }

    public String checkInput(String input) {
        String type = null;
        int sameLength = 0;
        String[] check;

        if (input.contains(".") || input.contains("-")) {
            check = input.split("\\s+");
        } else {
            check = input.toUpperCase().replace(" ", "").split("");
        }

        for (int i = 0; i < check.length; i++) {
            for (int j = 0; j < morseArray.length; j++) {
                if (check[i].equals(morseArray[j])) {
                    sameLength++;
                }
            }
        }

        if (sameLength == check.length) {
            type = "morse";
        }

        sameLength = 0;

        for (int i = 0; i < check.length; i++) {
            for (int j = 0; j < alfaArray.length; j++) {
                if (check[i].equals(alfaArray[j])) {
                    sameLength++;
                }
            }
        }

        if (sameLength == check.length) {
            type = "text";
        }

        return type;
    }

    public void decipherMorse(String input) {
        String[] chars = input.split("\\s+");

        for (int i = 0; i < chars.length; i++) {
            this.output += toText.get(chars[i]);
        }
    }

    public void encryptText(String input) {
        String[] chars = input.toUpperCase().replace(" ", "").split("");

        for (int i = 0; i < chars.length; i++) {
            this.output += toMorse.get(chars[i]);
            if (i != chars.length-1) {
                this.output += " ";
            }
        }
    }

    public String getOutput() {
        return output;
    }
}
