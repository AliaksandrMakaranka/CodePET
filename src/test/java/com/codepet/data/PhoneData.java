package com.codepet.data;

public class PhoneData {

    private static final String VALID_PHONE_NUMBER = "+71345678912";
    private static final String PHONE_NUMBER_WITHOUT_PREFIX_PLUS = "713456789120";

    public static String getValidPhoneNumber() {
        return VALID_PHONE_NUMBER;
    }

    public static String getPhoneNumberWithoutPrefixPlus() {
        return PHONE_NUMBER_WITHOUT_PREFIX_PLUS;
    }

}
