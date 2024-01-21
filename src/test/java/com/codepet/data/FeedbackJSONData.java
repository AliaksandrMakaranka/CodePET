package com.codepet.data;


public class FeedbackJSONData {
    public static String randomMinValueValidJsonData() {
        return """
                {
                    "name": "%s",
                    "phone": "%s",
                    "email": "%s",
                    "text": "%s"
                }
                """.formatted(NameData.getMinNameLength(), PhoneData.getValidPhoneNumber(), EmailData.getMinEmailValidValue(), TextData.getMinTextValue());
    }

    public static String randomMaxValueValidJsonData() {
        return """
                {
                    "name": "%s",
                    "phone": "%s",
                    "email": "%s",
                    "text": "%s"
                }
                """.formatted(NameData.getMaxNameLength(), PhoneData.getValidPhoneNumber(), EmailData.getMaxEmailValidValue(), TextData.getMaxTextValue());
    }





}
