package homeworks.string;


import homework.string.ContentVerification;
import homework.string.ReadUserTextUtil;
import homework.string.model.OperationsWithStringModel;

/**
 * HomeworkString.OperationWithString
 * 26.11.2019
 * <p>
 * проаналізувати довільний тект, котрий можна ввести з консолі, вивести на еран:
 * DONE  1) Кількість символів в тектсі;
 * DONE  2) Кількість літер 'a';
 * DONE  3) Тесктс з заміненими всіма літерами 'a' на 'A';
 * DONE  4) Всі слова в вигляді масиву;
 * DONE  5) ЧАстину тестку від першої букви 'a' до останньої 'a';
 * DONE  6) Номери літер 'a' в тексті (індекси);
 * DONE  7) Стрічку задом наперед;
 * DONE  8) ВЕсь текст малими літерами;
 * DONE  9) Весь текст великими;
 * DONE  10) приведення
 * DONE  11) ^ символ
 */

public class OperationWithString {

    /**
     * Variables whet used in class
     */


    public static void main(String[] args) {
        OperationsWithStringModel model = new OperationsWithStringModel();

        /** Call the methods and set in model */

        model.setSentence(new ReadUserTextUtil().getStringFromConsole());
//        System.out.println ("getSentence method 1 " + m.getSentence ());
        model.setSentenceLength(textLength(model.getSentence()));
        model.setCountLetters(countLetters(model.getSentence()));

        model.setChangeSymbolFromOldToNewOne(changeSymbolFromOldToNew(model.getSentence()));

        try {
            sentenceToArray(model.getSentence());
        } catch (Exception e) {
            System.out.println("Exeption ");
        }

        model.setStringToArray(sentenceToArray(model.getSentence()));
        model.setTextFromTo(partOfSentence(model.getSentence()));
        indexOfSymbols(model.getSentence());
        model.setReverseSentence(viceVersa(model.getSentence()));
        model.setSmallLT(toLoverCase(model.getSentence()));
        model.setBigLT(toUperCase(model.getSentence()));

    }


    /**
     * Count letters on user inputs from console
     */

    public static int textLength(String userInput) {
        System.out.println("Sentence length is: " + userInput.length());
        System.out.println();

        return userInput.length();
    }

    /**
     * Count chosen by user letter in sentence
     **/

    public static long countLetters(String userInput) {
        boolean containsOrNot;
        ReadUserTextUtil bReader1 = new ReadUserTextUtil();
        ContentVerification contVerification1 = new ContentVerification();
        int countLetters1 = 0;
        System.out.println("Please Inset a symbol what should count: ");
        char symbol;
        do {

            symbol = bReader1.BufferedReaderChar();
            containsOrNot = contVerification1.verifyUserCharInput(userInput, symbol);

        } while (!containsOrNot);


        if (containsOrNot) {
            int i;
            for (i = 0; userInput.length() - 1 >= i; i++) {

                char charAt = userInput.charAt(i);
                if (charAt == symbol) {
                    countLetters1++;

                }
            }
        }

        System.out.println("There are " + countLetters1 + " of '" + symbol + "' symbol in your '"
                + userInput + "' input ");
        System.out.println();
        return countLetters1;
    }


    /**
     * Change one symbol to new one
     */

    public static String changeSymbolFromOldToNew(String userInput) {
        char oldSymbol = 0;
        char newSymbol = 0;

        boolean containsYesNo1;
        ReadUserTextUtil bReader2 = new ReadUserTextUtil();
        ReadUserTextUtil bReader3 = new ReadUserTextUtil();
        ContentVerification contVerification2 = new ContentVerification();


        System.out.println("Inset symbol what should change in this '" + userInput + "'" + " sentence");

        do {
            oldSymbol = bReader2.BufferedReaderChar();
            containsYesNo1 = contVerification2.verifyUserCharInput(userInput, oldSymbol);

        } while (containsYesNo1 == false);

        System.out.println("Inset symbol to what should change: ");

        newSymbol = bReader3.BufferedReaderChar();

        System.out.println("old char: '" + oldSymbol + "'" + "; new char: '" + newSymbol + "'");

        System.out.println("Sentence with changed symbols '" + userInput.replace(oldSymbol, newSymbol) + "'");

        System.out.println();

        return userInput.replace(oldSymbol, newSymbol);
    }


    /**
     * Convert user input to array
     */

    public static char[] sentenceToArray(String userInput) {

        System.out.println("Sentence as array of chars -");
        char[] StringToArr = userInput.toCharArray();
        for (char output : StringToArr)
            System.out.println(output);
        return StringToArr;
    }


    /**
     * Trim a part of user input from letter1 to letter2
     */

    public static String partOfSentence(String userInput) {
        char firstSymbol = 0;
        char lastSymbol = 0;
        boolean containsYesNo2;
        boolean containsYesNo3;

        ReadUserTextUtil bReader4 = new ReadUserTextUtil();
        ReadUserTextUtil bReader5 = new ReadUserTextUtil();
        ContentVerification contVerification3 = new ContentVerification();
        ContentVerification contVerification4 = new ContentVerification();
        System.out.println("Inset symbol from what should trim: ");
        do {
            firstSymbol = bReader4.BufferedReaderChar();
            containsYesNo2 = contVerification3.verifyUserCharInput(userInput, firstSymbol);

        } while (containsYesNo2 == false);

        System.out.println("Inset symbol till what should trim: ");
        do {
            lastSymbol = bReader5.BufferedReaderChar();
            containsYesNo3 = contVerification4.verifyUserCharInput(userInput, firstSymbol);

        } while (containsYesNo3 == false);


        userInput = userInput.substring(userInput.indexOf(firstSymbol),
                userInput.lastIndexOf(lastSymbol) + 1);

        System.out.println("Your trimed sentence is '" + userInput + "'");
        System.out.println();

        return userInput;
    }

    /**
     * Display index(es) of some symbol
     */

    public static void indexOfSymbols(String userInput) {
        ReadUserTextUtil bReader5 = new ReadUserTextUtil();
        ContentVerification contVer2 = new ContentVerification();
        char symbolForIndex = 0;
        boolean conditionYesNo5;

        System.out.println("Please insert symbol from what should return index(es) ");

        do {
            symbolForIndex = bReader5.BufferedReaderChar();
            conditionYesNo5 = contVer2.verifyUserCharInput(userInput, symbolForIndex);
        } while (conditionYesNo5 == false);

        for (int s = -1; (s = userInput.indexOf(symbolForIndex, s + 1)) != -1; s++) {
            System.out.println("index(es) of the symbol() s - " + s);
        }
        System.out.println();

    }

    /**
     * Display user input form last letter to first
     */

    public static String viceVersa(String userInput) {

        String reverse = "";

        for (int i = userInput.length() - 1; i >= 0; i--) {
            reverse = reverse + userInput.charAt(i);
        }

        System.out.println("Reversed string is:");
        System.out.println(reverse);

        System.out.println();
        return reverse;
    }

    /**
     * Convert all the letters from user input to lover case
     */

    public static String toLoverCase(String userInput) {
        System.out.println("String to lover case '" + userInput.toLowerCase() + "'");
        return userInput.toLowerCase();
    }


    /**
     * Convert all the letters from user input to upper case
     */
    public static String toUperCase(String userInput) {
        System.out.println("String to upper case '" + userInput.toUpperCase() + "'");
        return userInput.toUpperCase();
    }
}
