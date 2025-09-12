package homework.lesson9;

public class DocumentValidator {
    public void checkLetters(String documentNumber) throws DocumentNameValidationLettersException {
        if (documentNumber.contains("abc")) {
            throw new DocumentNameValidationLettersException("Document name cannot contain sequence 'abc'.");
        }
    }

    public void checkNumbers(String documentNumber) throws DocumentNameValidationNumbersException {
        if (documentNumber.contains("555")) {
            throw new DocumentNameValidationNumbersException("Document name cannot contain sequence '555'.");
        }
    }

    public void checkNumbersAndLetters(String documentNumber) throws DocumentNameValidationNumbersAndLettersException {
        if (documentNumber.contains("1a2b")) {
            throw new DocumentNameValidationNumbersAndLettersException("Document name cannot contain sequence '1a2b.'.");
        }
    }
}
