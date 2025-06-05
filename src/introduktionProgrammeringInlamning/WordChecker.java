package introduktionProgrammeringInlamning;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class WordChecker {

    @Test
    public void testRowCounter() {
        //Arrange
        WordCounter counter = new WordCounter();

        //Act
        counter.increment("Hej, jag heter Hasse");
        int actual = counter.getRowCount();
        int expected = 1;

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void test3Rows() {
        //Arrange
        WordCounter counter = new WordCounter();

        //Act
        counter.increment("Idag är en god dag");
        counter.increment("för att gå ut och äta");
        counter.increment("picnic!");
        int actual = counter.getRowCount();
        int expected = 3;

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testCharacterCounter() {
        //Arrange
        WordCounter counter = new WordCounter();

        //Act
        counter.increment("Det här är en mening med en massa tecken");
        int actual = counter.getCharacterCount();
        int expected = 40;

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testWordCounter() {
        //Arrange
        WordCounter counter = new WordCounter();

        //Act
        counter.increment("Det här är en mening med en massa ord");
        int actual = counter.getWordCount();
        int expected = 9;

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testUntilStop() {
        //Arrange
        WordCounter counter = new WordCounter();

        //Act
        counter.increment("Jag heter Kalle");
        counter.increment("och jag gillar att programmera!");
        counter.increment("stop");
        boolean actual = counter.stop();
        boolean expected = true;

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testWordCounterUntilStop() {
        //Arrange
        WordCounter counter = new WordCounter();

        //Act
        counter.increment("ABC    def");
        counter.increment("meningen ovan räknas bara som två ord!");
        counter.increment("");
        counter.increment("oj, jag råkade trycka på Enter utan att skriva något!");
        counter.increment("stop! denna mening skall inte räknas med!");
        int actual = counter.getWordCount();
        int expected = 19;

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void test5RowsWith0Words() {
        //Arrange
        WordCounter counter = new WordCounter();

        //Act
        counter.increment("");
        counter.increment("");
        counter.increment(" ");
        counter.increment("");
        counter.increment("   ");
        int actual = counter.getWordCount();
        int expected = 0;

        //Assert
        assertEquals(expected, actual);
    }
}
