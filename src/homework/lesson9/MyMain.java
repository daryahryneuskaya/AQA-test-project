package homework.lesson9;

import javax.security.auth.login.LoginException;

public class MyMain {
    public static void main(String[] args) throws LoginException, WrongPasswordException {
        DocumentValidator first = new DocumentValidator();
        try {
            first.checkLetters("abc66td");
        } catch (DocumentNameValidationLettersException e) {
            System.out.println("validation failed: " + e.getMessage());
        }
        try {
            first.checkNumbers("34453444555dsf");
        } catch (DocumentNameValidationNumbersException e) {
            System.out.println("validation failed: " + e.getMessage());
        }
        try {
            first.checkNumbersAndLetters("65551a2b");
        } catch (DocumentNameValidationNumbersAndLettersException e) {
            System.out.println("validation failed: " + e.getMessage());
        }

        //TASK2
        System.out.println(".".repeat(70));
        boolean result = LoginFormValidation.checkLoginForm("darya", "6374fTubd82",
                "6374fTubd82");
        System.out.println("Result: " + result);
    }
}
