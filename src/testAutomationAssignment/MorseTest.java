package testAutomationAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MorseTest {

    @Test
    public void charToMorse() {
        //Arrange
        MorseLogic character = new MorseLogic();
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
        MorseLogic morse = new MorseLogic();
        String input = ".-";
        morse.decipherMorse(input);

        String expected = "A";
        String actual = morse.getOutput();

        assertEquals(expected, actual);
    }

    @Test
    public void lastCharToMorse() {
        MorseLogic character = new MorseLogic();
        String input = "Z";
        character.encryptText(input);

        String expected = "--..";
        String actual = character.getOutput();

        assertEquals(expected, actual);
    }

    @Test
    public void lastMorseToChar() {
        MorseLogic morse = new MorseLogic();
        String input = "--..";
        morse.decipherMorse(input);

        String expected = "Z";
        String actual = morse.getOutput();

        assertEquals(expected, actual);
    }

    @Test
    public void checkBlankSpace() {
        MorseLogic test = new MorseLogic();
        String input = "";
        test.checkInput(input);

        String expected = null;
        String actual = test.checkInput(input);

        assertEquals(expected, actual);
    }

    @Test
    public void checkAlfabet() {
        MorseLogic text = new MorseLogic();
        String input = "this is a string using only alfabet";
        text.checkInput(input);

        String expected = "text";
        String actual = text.checkInput(input);

        assertEquals(expected, actual);
    }

    @Test
    public void checkMorse() {
        MorseLogic text = new MorseLogic();
        String input = "-- --- .-. ... . -.-. --- -.. .";
        text.checkInput(input);

        String expected = "morse";
        String actual = text.checkInput(input);

        assertEquals(expected, actual);
    }

    @Test
    public void checkNull() {
        MorseLogic text = new MorseLogic();
        String input = "hello! I slept 8 hours today.";
        text.checkInput(input);

        String expected = null;
        String actual = text.checkInput(input);

        assertEquals(expected, actual);
    }

    @Test
    public void wordToMorse() {
        MorseLogic text = new MorseLogic();
        String input = "Hasse";
        text.encryptText(input);

        String expected = ".... .- ... ... .";
        String actual = text.getOutput();

        assertEquals(expected, actual);
    }

    @Test
    public void morseToWord() {
        MorseLogic morse = new MorseLogic();
        String input = "... - . .- -.-";
        morse.decipherMorse(input);

        String expected = "STEAK";
        String actual = morse.getOutput();

        assertEquals(expected, actual);
    }

    @Test
    public void textToMorse() {
        MorseLogic text = new MorseLogic();
        String input = "today i want to bake some bread";
        text.encryptText(input);

        String expected = "- --- -.. .- -.-- .. .-- .- -. - - --- -... .- -.- . ... --- -- . -... .-. . .- -..";
        String actual = text.getOutput();

        assertEquals(expected, actual);
    }

    @Test
    public void morseToText() {
        MorseLogic morse = new MorseLogic();
        String input = ".... . .-.. .-.. --- .-- --- .-. .-.. -..";
        morse.decipherMorse(input);

        String expected = "HELLOWORLD";
        String actual = morse.getOutput();

        assertEquals(expected, actual);
    }
}
