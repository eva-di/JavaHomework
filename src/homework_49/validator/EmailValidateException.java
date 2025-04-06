package homework_49.validator;

// extends RuntimeException - для НЕ-проверяемых исключений
// extends Exception - для проверяемых исключений

public class EmailValidateException extends Exception {

    /*
    getMessage() - возвращает строку с коротким описанием исключения
    getCause() - возвращает исключение, которое вызвало это исключение
    toString() - строковое представление исключения
    printStackTrace() - выводит трассировку исключения (где возникло и т.д.)
     */

    public EmailValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Email validate exception | " + super.getMessage();
    }
}
