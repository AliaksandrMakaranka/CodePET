package com.codepet.data;

public class UtilData {
    private static final String ENTER_CYRILLIC_NAME = """
            {
                "name": [
                    "Введите имя кириллицей"
                ]
            }
            """.trim();

    private static final String EMPTY_FIELD = """
            {
                "name": [
                    "Это поле не может быть пустым."
                ]
            }
            """.trim();

    private static final String NAME_LENGTH = """
            {
                "name": [
                    "Длина поля от 2 до 40 символов"
                ]
            }
            """.trim();


    private static final String INCORRECT_PHONE_NUMBER = """
            {
                "phone": [
                    "Номер должен начинаться с +7, и содержать 12 символов. Вторая цифра в номере не может быть 0"
                ]
            }            
            """.trim();

    private static final String INCORRECT_EMAIL_ADDRESS = """
            {
                "email": [
                    "Введите правильный адрес электронной почты."
                ]
            }
            """.trim();

    private static final String EMPTY_EMAIL_ADDRESS = """
            {
                "email": [
                    "Это поле не может быть пустым."
                ]
            }
            """.trim();

    private static final String OVER_MAX_EMAIL_ADDRESS = """
            {
                "email": [
                    "Максимальная длинна пользовательской части: 64 символа."
                ]
            }
            """.trim();

    private static final String OVER_MAX_TEXT_VALUE = """
            {
                "text": [
                    "Длина поля от 10 до 750 символов",
                    "Убедитесь, что это значение содержит не более 750 символов."
                ]
            }
            """.trim();


    private static final String OVER_MIN_TEXT_VALUE = """
            {
                "text": [
                    "Длина поля от 10 до 750 символов"
                ]
            }
            """.trim();

    private static final String EMPTY_TEXT_VALUE = """
            {
                "text": [
                    "Это поле не может быть пустым."
                ]
            }
            """.trim();

    public static String getEnterCyrillicName() {
        return ENTER_CYRILLIC_NAME;
    }

    public static String getEmptyField() {
        return EMPTY_FIELD;
    }

    public static String getNameLength() {
        return NAME_LENGTH;
    }

    public static String getIncorrectPhoneNumber() {
        return INCORRECT_PHONE_NUMBER;
    }

    public static String getIncorrectEmailAddress() {
        return INCORRECT_EMAIL_ADDRESS;
    }

    public static String getEmptyEmailAddress() {
        return EMPTY_EMAIL_ADDRESS;
    }

    public static String getOverMaxEmailAddress() {
        return OVER_MAX_EMAIL_ADDRESS;
    }

    public static String getOverMaxTextValue() {
        return OVER_MAX_TEXT_VALUE;
    }

    public static String getOverMinTextValue() {
        return OVER_MIN_TEXT_VALUE;
    }

    public static String getEmptyTextValue() {
        return EMPTY_TEXT_VALUE;
    }

}
