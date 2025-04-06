package lesson_49.validator;

public class PersonValidator {

    public static void validateEmail(String email) throws EmailValidateException {

        //throw - Ключевое слово используется для явного выброса исключения (создание объекта исключения)

        if (email == null) throw new EmailValidateException("email should be not null");

        // 1. Должна быть 1 @ и только одна
        int indexAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != lastAt) throw new EmailValidateException("@ error");

        // 2. Должна быть точка после собаки
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) throw new EmailValidateException(". after @ error");

        // 3. после последней точки есть 2 или более символов
        int lastDotIndex = email.lastIndexOf('.');
        if (lastDotIndex >= email.length() - 2) throw new EmailValidateException("last . error");

        // 4. Допустимые символы: алфавит, цифры, '-', '_', '@', '.'
        /*
        Проверяю все символы в строке. Проверяю текущий символ.
        Если нахожу хоть один неправильный сразу возвращаю false.
         */
        // String.toCharArray() - который возвращает массив чаров -> char[]

        for (char ch : email.toCharArray()) {

            // проверка символов на правильность
            boolean isPass = Character.isAlphabetic(ch)
                    || Character.isDigit(ch)
                    || ch == '-'
                    || ch == '_'
                    || ch == '.'
                    || ch == '@';
            // Если символ не подХодит (isPass = false) возвращаю false
            if (!isPass) throw new EmailValidateException("illegal symbol"); // делай что-то, если переменная false
        }

        // 5. До собаки должен быть хотя бы 1 символ. То есть индекс собаки не равен 0
        if (indexAt == 0) throw new EmailValidateException("@ should be not first");
        // 6. 1 символ должна быть буква. Символ с индексом 0 должна быть буква
        if (!Character.isLetter(email.charAt(0))) throw new EmailValidateException("first symbol should be letter");

        // Все проверки пройдены, email подходит
    }
}
