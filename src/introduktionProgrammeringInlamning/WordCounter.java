package introduktionProgrammeringInlamning;

public class WordCounter {

    private int characters, rows, words;
    private String longestWord;
    private boolean stop;

    public WordCounter() {
        this.characters = 0;
        this.rows = 0;
        this.words = 0;
        this.longestWord = "";
        this.stop = false;
    }

    //takes a String "input" and counts amount of characters, rows and words as well as stores the longest word, while also checking if the user typed "stop"
    public void increment(String input) {

        //Store all the words from "input", separated by a whitespace in the array "arrayOfWords"
        String[] arrayOfWords = input.split("\\s+");

        //if the given line of input doesn't contain the word "stop", do:
        if (!input.contains("stop")) {
            //each line of text adds is a row
            rows++;

            //first for-loop counts amount of characters from "input"
            //The commented code is an addition that does not count whitespaces as characters
            for (int i = 0; i < input.length(); i++) {
                //char c = input.charAt(i);
//                //if the character is a whitespace, do not count them
//                if (c != ' ') {
//                    this.characters++;
//                }
                this.characters++;
            }

            //as long as the input isn't just a whitespace, empty or contains the word "stop", updates the word counter
            if (!input.trim().isEmpty() && !input.contains("stop")) {
                //arrayOfWords.length equals the amount of words stored in the array, and add that amount to "words"
                words += arrayOfWords.length;
            }

            //same function as for (int i = 0; i < arrayOfWords.length; i++), where for each loop,
            //it assigns the attribute "String word" with the String of the position "i" from "arrayOfWords"
            for (String word : arrayOfWords) {
                //the first loop always replaces "longestWord" with the first word in the array
                //the subsequent loops then check if the previous word is longer than the next word, next in line of the array
                if (longestWord.length() < word.length()) {
                    longestWord = word;
                }
            }
        } else {    //if input is "stop", changes the boolean "stop" to true
            stop = true;
        }
    }

    public String removeExcessSpaces(String input) {
        //cleans the "input" of all consecutive spaces
        input = input.replaceAll("\\s+", " ");
        //"\\s+" is a regular expression that matches one or more whitespace, and then replaces it with a singular whitespace
        return input;
    }

    public String getLongestWord() {
        return longestWord;
    }

    //returns amount of characters
    public int getCharacterCount() {
        return characters;
    }

    //returns amount of words
    public int getWordCount() {
        return words;
    }

    //returns amount of rows
    public int getRowCount() {
        return rows;
    }

    //if true, returns the boolean "stop", which in turn stops the while-loop
    public boolean stop() {
        return stop;
    }
}
