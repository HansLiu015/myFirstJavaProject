package user;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void testGetUsername() {
        //Arrange
        User user = new User("Hasse", "hasselnot123");

        //Act
        String actual = user.getUsername();
        String expected = "Hasse";

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testGetPassword() {
        User user = new User("Kottan", "kottan321");

        String actual = user.getPassword();
        String expected = "kottan321";

        assertEquals(expected, actual);
    }

    @Test
    public void testChangeUsername() {
        User user = new User("felnamn", "password312");
        user.changeUsername("Rattnamn");

        String actual = user.getUsername();
        String expected = "Rattnamn";

        assertEquals(expected, actual);
    }

    @Test
    public void testChangePassword() {
        User user = new User("Thor", "pa");
        user.changePassword("Enstarkl0sen!");

        String actual = user.getPassword();
        String expected = "Enstarkl0sen!";

        assertEquals(expected, actual);
    }

    @Test
    public void testLessThan4CharacterUsername() {
        User user = new User("Adam", "qwertyuiop");
        user.changeUsername("Eva");

        String actual = user.getUsername();
        String expected = "Adam";

        assertEquals(expected, actual);
    }

    @Test
    public void testLessThan7MoreThan20Password() {
        User user = new User("Ulle", "asdasdasd");
        user.changePassword("abc");

        String actual = user.getPassword();
        String expected = "asdasdasd";

        assertEquals(expected, actual);
    }

    @Test
    public void testTypeOfUser() {
        User user = new User("Rudolph", "dsadsadsa");

        String actual = user.getTypeOfUser();
        String expected = "normal";

        assertEquals(expected, actual);
    }

    @Test
    public void testChangeUserType() {
        User user = new User("Rodulph", "qwerty123!");
        user.changeUserType("admin");

        String actual = user.getTypeOfUser();
        String expected = "admin";

        assertEquals(expected, actual);
    }

    @Test
    public void testPasswordContainsSpecialCharacter() {
        User user = new User("Rodulph", "badpass");
        user.changePassword("Goodpass1$");

        boolean actual = user.containsSpecialCharacter(user.getPassword());
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void testPasswordContainsSmallAndBigCharacter() {
        User user = new User("Sean", "badpa$s");
        user.changePassword("goodPass1$");

        boolean actual = user.containsSmallAndBigLetter(user.getPassword());
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void testChangeUserTypeToGoldMember() {
        User user = new User("Daniel", "kreativl0$eN");
        user.changeUserType(21);

        String actual = user.getTypeOfUser();
        String expected = "gold member";

        assertEquals(expected, actual);
    }
}
