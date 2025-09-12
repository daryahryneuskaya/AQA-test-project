package homework.lesson9;

import javax.security.auth.login.LoginException;

public class LoginFormValidation {
    private String login;
    private String password;
    private String confirmPassword;


    public LoginFormValidation(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }


    public static boolean checkLoginForm(String login, String password, String confirmPassword) {
        try {
            // Проверка логина
            if (login.length() > 20 || login.contains(" ")) {
                throw new WrongLoginException("Your login is incorrect! Length should be less than 20 and spaces " +
                        "are forbidden!");
            }

            // Проверка пароля на длину
            if (password.length() > 20) {
                throw new WrongPasswordException("Your password is incorrect! Length should be less than 20!");
            }
            //Проверка на пробел
            if (password.contains(" "))
                throw new WrongPasswordException("Your password is incorrect! Spaces are forbidden!");

            // Проверка совпадения пароля и подтверждения
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Password and confirmPassword do not match!");
            }

            // Проверка, что пароль содержит хотя бы одну цифру
            boolean hasDigit = false;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    hasDigit = true;
                    break;
                }
            }
            if (!hasDigit) {
                throw new WrongPasswordException("Password must contain at least one digit!");
            }
            return true;

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Validation failed: " + e.getMessage());
            return false;
        }
    }
}



