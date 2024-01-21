package com.codepet.data;

public class EmailData {

        private static final String NAME = "HvjRZ4nNUGtA6cLtYbFjN6kvxs86r6U1Y9LFaIlTKd3dFZpG8DL8DL8DL8DL8DLs"; //64 chars
    public static final String DOM_NAME = "HvjRZ4nNUGtA6cLtYbFjN6kvxs86r6U1Y9LFaIlTKd3dFZpG8DL8DL8DL8DL8DL"; //63 chars
    public static final String COM = "ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff1"; //63 chars
    private static final String MIN_EMAIL_VALID_VALUE = "qa@qa.qa";
    private static final String MAX_EMAIL_VALID_VALUE = NAME + "@" + DOM_NAME + "." + COM;

    public static String getMinEmailValidValue() {
        return MIN_EMAIL_VALID_VALUE;
    }

    public static String getMaxEmailValidValue() {
        return MAX_EMAIL_VALID_VALUE;//192 chars
    }
}
