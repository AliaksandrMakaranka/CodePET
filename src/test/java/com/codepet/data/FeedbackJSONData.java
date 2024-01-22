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

    public static String randomValueWithLatinNameTextJsonData() {
        return """
                {
                    "name": "%s",
                    "phone": "%s",
                    "email": "%s",
                    "text": "%s"
                }
                """.formatted(NameData.getLatinText(), PhoneData.getValidPhoneNumber(), EmailData.getMaxEmailValidValue(), TextData.getMaxTextValue());
    }

    public static String randomValueWithEmptyNameTextJsonData() {
        return """
                {
                    "name": "%s",
                    "phone": "%s",
                    "email": "%s",
                    "text": "%s"
                }
                """.formatted(NameData.getEmptyString(), PhoneData.getValidPhoneNumber(), EmailData.getMaxEmailValidValue(), TextData.getMaxTextValue());
    }

    public static String randomValueWithHyphenNameTextJsonData() {
        return """
                {
                    "name": "%s",
                    "phone": "%s",
                    "email": "%s",
                    "text": "%s"
                }
                """.formatted(NameData.getHyphen(), PhoneData.getValidPhoneNumber(), EmailData.getMaxEmailValidValue(), TextData.getMaxTextValue());
    }

    public static String randomValueWithIntNameTextJsonData() {
        return """
                {
                    "name": "%s",
                    "phone": "%s",
                    "email": "%s",
                    "text": "%s"
                }
                """.formatted(NameData.getInt(), PhoneData.getValidPhoneNumber(), EmailData.getMaxEmailValidValue(), TextData.getMaxTextValue());
    }

    public static String randomValueWithStringIntNameTextJsonData() {
        return """
                {
                    "name": "%s",
                    "phone": "%s",
                    "email": "%s",
                    "text": "%s"
                }
                """.formatted(NameData.getStringInt(), PhoneData.getValidPhoneNumber(), EmailData.getMaxEmailValidValue(), TextData.getMaxTextValue());
    }

    public static String randomValueWithDoubleHyphenNameTextJsonData() {
        return """
                {
                    "name": "%s",
                    "phone": "%s",
                    "email": "%s",
                    "text": "%s"
                }
                """.formatted(NameData.getDoubleHyphen(), PhoneData.getValidPhoneNumber(), EmailData.getMaxEmailValidValue(), TextData.getMaxTextValue());
    }

    public static String randomMinValuePhoneNumberWithoutPrefixJsonData() {
        return """
                {
                    "name": "%s",
                    "phone": "%s",
                    "email": "%s",
                    "text": "%s"
                }
                """.formatted(NameData.getMinNameLength(), PhoneData.getPhoneNumberWithoutPrefixPlus(), EmailData.getMinEmailValidValue(), TextData.getMinTextValue());
    }

    public static String randomEmailNameWithDotStartJsonData() {
        return """
                {
                    "name": "%s",
                    "phone": "%s",
                    "email": "%s",
                    "text": "%s"
                }
                """.formatted(NameData.getMinNameLength(), PhoneData.getValidPhoneNumber(), EmailData.getEmailNameWithDotsStart(), TextData.getMinTextValue());
    }

    public static String randomEmailNameWithDotEndJsonData() {
        return """
                {
                    "name": "%s",
                    "phone": "%s",
                    "email": "%s",
                    "text": "%s"
                }
                """.formatted(NameData.getMinNameLength(), PhoneData.getValidPhoneNumber(), EmailData.getEmailNameWithDotEnd(), TextData.getMinTextValue());
    }

    public static String randomEmailNameWithDashStartJsonData() {
        return """
                {
                    "name": "%s",
                    "phone": "%s",
                    "email": "%s",
                    "text": "%s"
                }
                """.formatted(NameData.getMinNameLength(), PhoneData.getValidPhoneNumber(), EmailData.getEmailNameWithDashStart(), TextData.getMinTextValue());
    }

    public static String randomEmailNameWithDashEndJsonData() {
        return """
                {
                    "name": "%s",
                    "phone": "%s",
                    "email": "%s",
                    "text": "%s"
                }
                """.formatted(NameData.getMinNameLength(), PhoneData.getValidPhoneNumber(), EmailData.getEmailNameWithDashEnd(), TextData.getMinTextValue());
    }

    public static String emptyEmailValueJsonData() {
        return """
                {
                    "name": "%s",
                    "phone": "%s",
                    "email": "%s",
                    "text": "%s"
                }
                """.formatted(NameData.getMinNameLength(), PhoneData.getValidPhoneNumber(), EmailData.getEmptyEmail(), TextData.getMinTextValue());
    }

    public static String overMinEmailValueJsonData() {
        return """
                {
                    "name": "%s",
                    "phone": "%s",
                    "email": "%s",
                    "text": "%s"
                }
                """.formatted(NameData.getMinNameLength(), PhoneData.getValidPhoneNumber(), EmailData.getMinEmailIncorrectValue(), TextData.getMinTextValue());
    }

    public static String overMaxEmailValueJsonData() {
        return """
                {
                    "name": "%s",
                    "phone": "%s",
                    "email": "%s",
                    "text": "%s"
                }
                """.formatted(NameData.getMinNameLength(), PhoneData.getValidPhoneNumber(), EmailData.getMaxEmailIncorrectValue(), TextData.getMinTextValue());
    }

    public static String overMinTextValueJsonData() {
        return """
                {
                    "name": "%s",
                    "phone": "%s",
                    "email": "%s",
                    "text": "%s"
                }
                """.formatted(NameData.getMinNameLength(), PhoneData.getValidPhoneNumber(), EmailData.getMinEmailValidValue(), TextData.getOverMinTextValue());
    }

    public static String overMaxTextValueJsonData() {
        return """
                {
                    "name": "%s",
                    "phone": "%s",
                    "email": "%s",
                    "text": "%s"
                }
                """.formatted(NameData.getMinNameLength(), PhoneData.getValidPhoneNumber(), EmailData.getMinEmailValidValue(), TextData.getOverMaxTextValue());
    }

    public static String emptyTextValueJsonData() {
        return """
                {
                    "name": "%s",
                    "phone": "%s",
                    "email": "%s",
                    "text": "%s"
                }
                """.formatted(NameData.getMinNameLength(), PhoneData.getValidPhoneNumber(), EmailData.getMinEmailValidValue(), TextData.getEmptyText());
    }

}
