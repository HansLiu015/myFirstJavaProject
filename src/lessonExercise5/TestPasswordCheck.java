package lessonExercise5;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TestPasswordCheck {

    @Test
    public void testCorrectPassword() {

        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = true;

        //Act
        boolean actual = pass.check("pas$word1");

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testLessThan8Characters() {

        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;

        //Act
        boolean actual = pass.check("pass1");

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testLessThan8CharactersAndNoDigits() {

        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;

        //Act
        boolean actual = pass.check("pass");

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testNoDigits() {

        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;

        //Act
        boolean actual = pass.check("passw#ord");

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testNoSpecialCharacters() {

        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;

        //Act
        boolean actual = pass.check("p4ssword");

        //Assert
        assertEquals(expected, actual);
    }

}
