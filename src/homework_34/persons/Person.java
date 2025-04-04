package homework_34.persons;

public class Person {
    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email;
        }
    }


    /*
    test@email.net
    1. Должна быть 1 @ и только одна
    2. Должна быть точка после собаки
    3. после последней точки есть 2 или более символов
    4. Допустимые символы: алфавит, цифры, '-', '_', '@', '.'
    5. До собаки должен быть хотя бы 1 символ
    6. 1 символ должна быть буква

     */
    private boolean isEmailValid(String email) {
        if(email == null) return false;
        // 1. Должна быть 1 @ и только одна
        int indexAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != lastAt) return false;

        // 2. Должна быть точка после собаки
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) return false;

        // 3. после последней точки есть 2 или более символов
        int lastDotIndex = email.lastIndexOf('.');
        if (lastDotIndex >= email.length() - 2) return false;

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
            if (!isPass) return false; // делай что-то, если переменная false
        }

        // 5. До собаки должен быть хотя бы 1 символ. То есть индекс собаки не равен 0
        if (indexAt == 0) return false;
        // 6. 1 символ должна быть буква. Символ с индексом 0 должна быть буква
        if (!Character.isLetter(email.charAt(0))) return false;

        // Все проверки пройдены, email подходит
        return true;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isPasswordValid(password)) {
        this.password = password;

        }
    }
    private boolean isPasswordValid(String password) {
        if (password == null || password.length() < 8) return false;

        boolean isDigit = false;
        boolean isUpper = false;
        boolean isLower = false;
        boolean isSpecial = false;

        // Альтернативный способ объявления переменных
        boolean [] result = new boolean[4]; // false, false, false, false
        String symbols = "!№%?*()[],.-";
        // перебирать символы
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) isDigit = true;
            if (Character.isUpperCase(ch)) isUpper = true;
            if (Character.isLowerCase(ch)) isLower = true;
//            if (symbols.contains(String.valueOf(ch))) isSpecial = true;
           if (symbols.indexOf(ch) >= 0) isSpecial = true;

        }
        //  System.out.printf("%s | %s | %s | %s\n", isDigit, isLower, isUpper, isSpecial);
        // Если хотяб одна из перемнных остfнется в значеyии false, то весь пароль не будет признан валидным (вернется false)
        return isDigit && isLower && isUpper && isSpecial;
    }


    /*
    Требования к паролю:
    1. Длина пароля больше или равна 8 символам
    2. Должна быть минимум 1 цифра
    3. Должна быть мин 1 маленькая буква (Сharacter.isLowerCase();
    4. Должна быть мин 1 большая буква
    5. Должен быть мин 1 спец символ: "!№%?*()[],.-"

    Пароль должен удовлетворять всем требованиям
    5 boolean переменных. Каждая отвечает за свой пункт
    Пароль будет подходить только если все пять имеют true
     */

//    public boolean isPasswordValid(String password) {
//        boolean isEight = false;
//        boolean hasLower = false;
//        boolean hasUpper = false;
//        boolean hasDigit = false;
//        boolean hasSpecial = false;
//
//        for (char ch : password.toCharArray()) {
//            if (Character.isDigit(ch)) hasDigit = true;
//            if (Character.isLowerCase(ch)) hasLower = true;
//            if (Character.isUpperCase(ch)) hasUpper = true;
//            if (password.length() >= 8) isEight = true;
//            if( ch == '!' || ch == '@' || ch == '?' || ch == '№'
//            || ch == '%' || ch == '*' || ch == '(' || ch == ')'
//                    || ch == '[' || ch == ']' || ch == ','
//                    || ch == '.' || ch == '-') hasSpecial = true;
//        }
//        if (isEight && hasDigit && hasLower && hasUpper && hasSpecial) return true;
//        return false;
//    }




    @Override
    public String toString() {
        return "Person34 {" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
