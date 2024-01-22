package com.codepet.data;

public class EmailData {

    private static final String NAME = "HvjRZ4nNUGtA6cLtYbFjN6kvxs86r6U1Y9LFaIlTKd3dFZpG8DL8DL8DL8DL8DLs"; //64 chars
    public static final String DOM_NAME = "HvjRZ4nNUGtA6cLtYbFjN6kvxs86r6U1Y9LFaIlTKd3dFZpG8DL8DL8DL8DL8DL"; //63 chars
    public static final String COM = "ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff1"; //63 chars
    public static final String DOT = ".";
    public static final String DOG = "@";
    public static final String EMAIL_NAME_WITH_DOTS_START = ".someDotStartName";
    public static final String EMAIL_NAME_WITH_DOTS_END = "someDotEndName.";
    public static final String EMAIL_NAME_WITH_DASH_START = "-someStartDashName";
    public static final String EMAIL_NAME_WITH_DASH_END = "someEndDashName-";
    public static final String EMPTY_EMAIL = "";
    private static final String MIN_EMAIL_VALID_VALUE = "qa@qa.qa";

    private static final String MIN_EMAIL_INCORRECT_VALUE = "a@a.a";
    private static final String MAX_EMAIL_INCORRECT_VALUE = NAME + NAME + DOG + DOM_NAME + DOT + COM;

    private static final String MAX_EMAIL_VALID_VALUE = NAME + DOG + DOM_NAME + DOT + COM;

    public static String getMinEmailValidValue() {
        return MIN_EMAIL_VALID_VALUE;
    }

    public static String getMaxEmailValidValue() {
        return MAX_EMAIL_VALID_VALUE;//192 chars
    }

    public static String getEmailNameWithDotsStart() {
        return EMAIL_NAME_WITH_DOTS_START + DOG + DOM_NAME + DOT + COM;
    }

    public static String getEmailNameWithDashEnd() {
        return EMAIL_NAME_WITH_DASH_END + DOG + DOM_NAME + DOT + COM;
    }

    public static String getEmailNameWithDashStart() {
        return EMAIL_NAME_WITH_DASH_START + DOG + DOM_NAME + DOT + COM;
    }

    public static String getEmailNameWithDotEnd() {
        return EMAIL_NAME_WITH_DOTS_END + DOG + DOM_NAME + DOT + COM;
    }

    public static String getEmptyEmail() {
        return EMPTY_EMAIL;
    }

    public static String getMinEmailIncorrectValue() {
        return MIN_EMAIL_INCORRECT_VALUE;
    }

    public static String getMaxEmailIncorrectValue() {
        return MAX_EMAIL_INCORRECT_VALUE;
    }

}
