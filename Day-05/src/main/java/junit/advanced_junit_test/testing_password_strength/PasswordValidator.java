package junit.advanced_junit_test.testing_password_strength;

public class PasswordValidator {

    public boolean isValid(String password) {
        if (password == null) {
            return false;
        }
        return password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*\\d.*");
    }
}

