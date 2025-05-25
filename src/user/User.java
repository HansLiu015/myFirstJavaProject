package user;

public class User {

    private String username, password, typeOfUser;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        typeOfUser = "normal";
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getTypeOfUser() {
        return typeOfUser;
    }

    public void changeUsername(String newUsername) {
        if (newUsername.length() >= 4) {
            username = newUsername;
        }
    }

    public void changePassword(String newPassword) {
        boolean correctLength = false;
        boolean containsSpecialCharacter = false;
        boolean containsLowercase = false;
        boolean containsUppercase = false;

        if (newPassword.length() >= 7 && newPassword.length() <= 20) {
            correctLength = true;
        }

        for (int i = 0; i < newPassword.length(); i++) {
            char c = newPassword.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                containsSpecialCharacter = true;
            }
        }

        for (int i = 0; i < newPassword.length(); i++) {
            char c = newPassword.charAt(i);
            if (Character.isLowerCase(c)) {
                containsLowercase = true;
            } else if (Character.isUpperCase(c)) {
                containsUppercase = true;
            }
        }

        if (correctLength && containsSpecialCharacter && containsLowercase && containsUppercase) {
            password = newPassword;
        }
    }

    public void changeUserType(String type) {
        if (type.equals("normal") || type.equals("admin") || type.equals("super") || type.equals("gold member")) {
            typeOfUser = type;
        }
    }

    public void changeUserType(int logins) {
        if (logins >= 20) {
            typeOfUser = "gold member";
        }
    }

    public boolean containsSpecialCharacter(String password) {
        boolean containsSpecialCharacter = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                containsSpecialCharacter = true;
            }
        }
        return containsSpecialCharacter;
    }

    public boolean containsSmallAndBigLetter(String password) {
        boolean smallLetter = false;
        boolean bigLetter = false;
        boolean containsSmallAndBigLetter = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isLowerCase(c)) {
                smallLetter = true;
            } else if (Character.isUpperCase(c)) {
                bigLetter = true;
            }
        }
        if (smallLetter && bigLetter) {
            containsSmallAndBigLetter = true;
        }

        return containsSmallAndBigLetter;
    }
}
