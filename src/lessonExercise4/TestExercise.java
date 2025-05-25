package lessonExercise4;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TestExercise {

    //Testfall
    @Test
    public void firstTestCase() {

        String text = "some text";  //innehåller 9 chars
        int actual = text.length();
        int expected = 9;  //så vi förväntar att actual är 9
        assertEquals(expected, actual);

    }

    //assertEquals(expected, actual), assertNotEquals

    @Test
    public void add() {

        //Arrange
        Calculator calc = new Calculator(2, 3);
        int expected = 5;

        //Act
        int actual = calc.add();

        //Assert
        assertEquals(expected, actual);

    }

}
