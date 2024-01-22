package com.codepet.data;

public class NameData {

    private static final String MAX_NAME_LENGTH_VALID = "О----цЧйчО-Б-вЕпПЧз--ЯхзМТФ-ъбКЗшэБфхМвр";
    private static final String MIN_NAME_LENGTH_VALID = "-Ы";
    private static final String EMPTY_STRING = "";
    private static final String HYPHEN = "-";
    private static final int INT = 1000;
    private static final String STRING_INT = "1000";
    private static final String DOUBLE_HYPHEN = "--";


    private static final String LATIN_TEXT = "SomeTextForName";

    public static String getMaxNameLength() {
        return MAX_NAME_LENGTH_VALID;
    }

    public static String getMinNameLength() {
        return MIN_NAME_LENGTH_VALID;
    }

    public static String getLatinText() {
        return LATIN_TEXT;
    }


    public static String getEmptyString() {
        return EMPTY_STRING;
    }

    public static String getHyphen() {
        return HYPHEN;
    }

    public static String getStringInt() {
        return STRING_INT;
    }

    public static String getDoubleHyphen() {
        return DOUBLE_HYPHEN;
    }

    public static int getInt() {
        return INT;
    }
}
