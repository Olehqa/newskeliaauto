package homework.string;

public class ContentVerification {

    boolean conditionsYesNo2 = false;
    int countLetters2 = 0;

    public boolean verifyUserCharInput(String userSentenceInput, char symbolUserInput) {

        for (int i = 0; userSentenceInput.length() - 1 >= i; i++) {
            char charAt = userSentenceInput.charAt(i);
            if (charAt == symbolUserInput) {
                countLetters2++;
            }
        }

        if (countLetters2 == 0) {
            System.out.println("Text '" + userSentenceInput + "' do not contains this '" + symbolUserInput +
                    "' symbol. Please type the symbol that contains in this text!");
            conditionsYesNo2 = false;
        } else {
            conditionsYesNo2 = true;
        }

        return conditionsYesNo2;
    }

}
