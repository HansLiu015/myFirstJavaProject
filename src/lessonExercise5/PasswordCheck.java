package lessonExercise5;

public class PasswordCheck {

    private String password;

    public boolean check(String password) {

        boolean enoughCharacters = false;
        boolean containsDigit = false;
        boolean containsSpecialCharacters = false;

        if (password.length() >= 8) {
            enoughCharacters = true;
        }

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                containsDigit = true;
            }
            if (!Character.isLetterOrDigit(c)) {
                containsSpecialCharacters = true;
            }
        }

        return enoughCharacters && containsDigit && containsSpecialCharacters;
    }
}
