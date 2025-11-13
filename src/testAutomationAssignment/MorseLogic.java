package testAutomationAssignment;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class MorseLogic {

    @Test
    public void charToMorse() {
        //Arrange
        MorseTest character = new MorseTest();
        String input = "A";
        character.encryptText(input);

        //Act
        String expected = ".-";
        String actual = character.getOutput();

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void morseToChar() {
        MorseTest morse = new MorseTest();
        String input = ".-";
        morse.decipherMorse(input);

        String expected = "A";
        String actual = morse.getOutput();

        assertEquals(expected, actual);
    }

    @Test
    public void checkAlfabet() {
        MorseTest text = new MorseTest();
        String input = "this is a string using only alfabet";
        text.checkInput(input);

        String expected = "text";
        String actual = text.checkInput(input);

        assertEquals(expected, actual);
    }

    @Test
    public void checkMorse() {
        MorseTest text = new MorseTest();
        String input = "-- --- .-. ... . -.-. --- -.. .";
        text.checkInput(input);

        String expected = "morse";
        String actual = text.checkInput(input);

        assertEquals(expected, actual);
    }

    @Test
    public void checkNull() {
        MorseTest text = new MorseTest();
        String input = "hello! I slept 8 hours today.";
        text.checkInput(input);

        String expected = null;
        String actual = text.checkInput(input);

        assertEquals(expected, actual);
    }

    @Test
    public void wordToMorse() {
        MorseTest text = new MorseTest();
        String input = "Hasse";
        text.encryptText(input);

        String expected = ".... .- ... ... .";
        String actual = text.getOutput();

        assertEquals(expected, actual);
    }

    @Test
    public void morseToWord() {
        MorseTest morse = new MorseTest();
        String input = "... - . .- -.-";
        morse.decipherMorse(input);

        String expected = "STEAK";
        String actual = morse.getOutput();

        assertEquals(expected, actual);
    }

    @Test
    public void textToMorse() {
        MorseTest text = new MorseTest();
        String input = "today i want to bake some bread";
        text.encryptText(input);

        String expected = "- --- -.. .- -.-- .. .-- .- -. - - --- -... .- -.- . ... --- -- . -... .-. . .- -..";
        String actual = text.getOutput();

        assertEquals(expected, actual);
    }

    @Test
    public void morseToText() {
        MorseTest morse = new MorseTest();
        String input = ".... . .-.. .-.. --- .-- --- .-. .-.. -..";
        morse.decipherMorse(input);

        String expected = "HELLOWORLD";
        String actual = morse.getOutput();

        assertEquals(expected, actual);
    }
}
