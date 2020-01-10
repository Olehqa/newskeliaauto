package homeworks.string;

public class ContentVerification {


    public static boolean isCharPresent(String textToValidate, char lookingChar) {
        boolean presentsOfChar;
        int countLetters = 0;
        for (int i = 0; textToValidate.length() > i; i++) {
            char charAt = textToValidate.charAt(i);
            if (charAt == lookingChar) {
                countLetters++;
            }
        }

        if (countLetters == 0) {
            System.out.println("Text '" + textToValidate + "' do not contains this '" + lookingChar +
                    "' symbol. Please type the symbol that contains in this text!");
            presentsOfChar = false;
        } else {
            presentsOfChar = true;
        }

        return presentsOfChar;
    }

}
