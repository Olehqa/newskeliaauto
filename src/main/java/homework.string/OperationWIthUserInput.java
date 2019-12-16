package homework.string;

public class OperationWIthUserInput {

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
        int countLetters = 0;
        System.out.println("Please Inset a symbol what should count: ");
        char symbol;
        do {

            symbol = ReadUserTextUtil.getCharFromConsole();
            containsOrNot = ContentVerification.isCharPresent(userInput, symbol);

        } while (!containsOrNot); // or ten times try


        for (int i = 0; userInput.length() - 1 >= i; i++) {

            char charAt = userInput.charAt(i);
            if (charAt == symbol) {
                countLetters++;

            }
        }


        System.out.println("There are " + countLetters + " of '" + symbol + "' symbol in your '"
                + userInput + "' input ");
        System.out.println();
        return countLetters;
    }


    /**
     * Change one symbol to new one
     */

    public static String changeSymbolFromOldToNew(String userInput) {
        char oldSymbol;
        char newSymbol;

        boolean containsYesNo1;


        System.out.println("Inset symbol what should change in this '" + userInput + "'" + " sentence");

        do {
            oldSymbol = ReadUserTextUtil.getCharFromConsole();
            containsYesNo1 = ContentVerification.isCharPresent(userInput, oldSymbol);

        } while (!containsYesNo1);//times

        System.out.println("Inset symbol to what should change: ");

        newSymbol = ReadUserTextUtil.getCharFromConsole();

        System.out.println("old char: '" + oldSymbol + "'" + "; new char: '" + newSymbol + "'");
// init new string for result and logging

        System.out.println("Sentence with changed symbols '" + userInput.replace(oldSymbol, newSymbol) + "'");

        System.out.println();

        return userInput.replace(oldSymbol, newSymbol);
    }


    /**
     * Convert user input to array
     */

    public static char[] sentenceToArray(String userInput) {

        System.out.println("Sentence as array of chars -");
        char[] userInputChars = userInput.toCharArray();
        for (char output : userInputChars) {
            System.out.println(output);
        }
        return userInputChars;
    }


    /**
     * Trim a part of user input from letter1 to letter2
     */

    public static String partOfSentence(String userInput) {
        char firstSymbol;
        char lastSymbol;
        boolean containsYesNo2;
        boolean containsYesNo3;

        System.out.println("Inset symbol from what should trim: ");
        do {
            firstSymbol = ReadUserTextUtil.getCharFromConsole();
            containsYesNo2 = ContentVerification.isCharPresent(userInput, firstSymbol);

        } while (!containsYesNo2);// times

        System.out.println("Inset symbol till what should trim: ");
        do {
            lastSymbol = ReadUserTextUtil.getCharFromConsole();
            containsYesNo3 = ContentVerification.isCharPresent(userInput, firstSymbol);

        } while (!containsYesNo3);


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
        char symbolForIndex;
        boolean conditionYesNo5;

        System.out.println("Please insert symbol from what should return index(es) ");

        do {
            symbolForIndex = ReadUserTextUtil.getCharFromConsole();
            conditionYesNo5 = ContentVerification.isCharPresent(userInput, symbolForIndex);
        } while (!conditionYesNo5);

        for (int s = -1; (s = userInput.indexOf(symbolForIndex, s + 1)) != -1; s++) {
            System.out.println("index(es) of the symbol() s - " + s);
        }
        System.out.println();

    }

    /**
     * Display user input form last letter to first
     */

    public static String viceVersa(String userInput) {

        String reverse = " ";

//        for (int i = userInput.length() - 1; i >= 0; i--) {
////            reverse = reverse userInput.charAt(i);
//        }

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
    public static String toUpperCase(String userInput) {
        System.out.println("String to upper case '" + userInput.toUpperCase() + "'");
        return userInput.toUpperCase();
    }
}
