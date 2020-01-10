package homeworks.string;

public class OperationWIthUserInput {

    /**
     * Count letters on user inputs from console
     */

    public static int getTextLength(String userInput) {
        int sentenceLength = userInput.length ();
        System.out.println ( "Sentence length is: " + sentenceLength );
        System.out.println ();

        return sentenceLength;
    }

    /**
     * Count chosen by user letter in sentence
     **/

    public static long getNumberOfSymbols(String userInput) {
        boolean isSymbolPresentInTheSentence;

        System.out.println ( "Please Inset a symbol what should count: " );
        int countSymbols = 0;

        char symbolForCount;
        int count = 0;

        do {

            symbolForCount = ReadUserTextUtil.getCharFromConsole ();
            isSymbolPresentInTheSentence = ContentVerification.isCharPresent ( userInput , symbolForCount );

            count++;
        } while (!isSymbolPresentInTheSentence && count < 3);


        for (int i = 0; userInput.length () - 1 >= i; i++) {

            char charAt = userInput.charAt ( i );
            if (charAt == symbolForCount) {
                countSymbols++;

            }
        }
        System.out.println ( "There are " + countSymbols + " of '" + symbolForCount + "' symbol in your '"
                + userInput + "' input " );
        System.out.println ();
        return countSymbols;
    }


    /**
     * Change one symbol to new one
     */

    public static String getChangedSentenceWithNewSymbols(String userInput) {
        char oldSymbol;
        char newSymbol;
        int count = 0;
        boolean isSymbolPresentsInSentence;
        String newSentence = "";


        System.out.println ( "Inset symbol what should change in this '" + userInput + "'" + " sentence" );

        do {
            oldSymbol = ReadUserTextUtil.getCharFromConsole ();
            isSymbolPresentsInSentence = ContentVerification.isCharPresent ( userInput , oldSymbol );
            count++;
        } while (!isSymbolPresentsInSentence && count < 3);
        if (isSymbolPresentsInSentence) {
            System.out.println ( "Inset symbol to what should change: " );

            newSymbol = ReadUserTextUtil.getCharFromConsole ();

            System.out.println ( "old char: '" + oldSymbol + "'" + "; new char: '" + newSymbol + "'" );
            System.out.println ( "old char: '" + oldSymbol + "'" + "; new char: '" + newSymbol + "'" );

            newSentence = userInput.replace ( oldSymbol , newSymbol );
            System.out.println ( "Sentence with changed symbols '" + newSentence + "'" );

            System.out.println ();
        } else {
            newSentence = userInput;
            System.out.println ( "The symbol that you are trying to change is not contains" +
                    " in the sentence. Lucky next time ;)" );
        }
        return newSentence;
    }


    /**
     * Convert user input to array
     */

    public static char[] getArrOfCharsFromSentence(String userInput) {

        System.out.println ( "Sentence as array of chars -" );
        char[] userInputChars = userInput.toCharArray ();
        for (char output : userInputChars) {
            System.out.println ( output );
        }
        return userInputChars;
    }


    /**
     * Trim a part of user input from letter1 to letter2
     */

    public static String getPartOfSentence(String userInput) {
        char firstSymbol;
        char lastSymbol;
        boolean isFirstCharInsideText;
        boolean isSecondCharInsideText;
        int count1 = 0;
        int count2 = 0;
// one while per two characters
// do {

        System.out.println ( "Inset symbol from what should trim: " );

        do {
            firstSymbol = ReadUserTextUtil.getCharFromConsole ();
            isFirstCharInsideText = ContentVerification.isCharPresent ( userInput , firstSymbol );
            count1++;
        } while (!isFirstCharInsideText && count1 < 6);
        if (isFirstCharInsideText) {
            System.out.println ( "Insert symbol till what should trim: " );
            do {
                lastSymbol = ReadUserTextUtil.getCharFromConsole ();
                isSecondCharInsideText = ContentVerification.isCharPresent ( userInput , lastSymbol );
                if (userInput.indexOf ( firstSymbol ) > userInput.lastIndexOf ( lastSymbol )) {

                    System.out.println ( "Еhe last character is located earlier than the first." +
                            " Please try again" );

                    isSecondCharInsideText = false;
                }
                count2++;
            } while (!isSecondCharInsideText && count2 < 6);

//        }while ();


            userInput = userInput.substring ( userInput.indexOf ( firstSymbol ) ,
                    userInput.lastIndexOf ( lastSymbol ) + 1 );

            System.out.println ( "Your trimmed sentence is '" + userInput + "'" );
            System.out.println ();
        } else {
            System.out.println ( "You enter incorrect first or last symbol. Trim will be canceled" );
        }
        return userInput;
    }

    /**
     * Display index(es) of some symbol
     */

    public static void indexOfSymbols(String userInput) {
        char symbolForIndex;
        boolean isSymbolInText;

        System.out.println ( "Please insert symbol from what should return index(es) " );

        do {
            symbolForIndex = ReadUserTextUtil.getCharFromConsole ();
            isSymbolInText = ContentVerification.isCharPresent ( userInput , symbolForIndex );
        } while (!isSymbolInText);

        for (int s = -1; (s = userInput.indexOf ( symbolForIndex , s + 1 )) != -1; s++) {
            System.out.println ( "index(es) of the symbol() s - " + s );
        }
        System.out.println ();

    }

    /**
     * Display user input form last letter to first
     */

    public static String getSentenceViseVersa(String userInput) {

        String viseVersaSentence = "";

        for (int i = userInput.length () - 1; i >= 0; i--) {
            viseVersaSentence = viseVersaSentence + userInput.charAt ( i );
        }

        System.out.println ( "Reversed string is:" );
        System.out.println ( viseVersaSentence );

        System.out.println ();
        return viseVersaSentence;
    }

    /**
     * Convert all the letters from user input to lover case
     */

    public static String getSentenceToLoverCase(String userInput) {
        System.out.println ( "String to lover case '" + userInput.toLowerCase () + "'" );
        return userInput.toLowerCase ();
    }


    /**
     * Convert all the letters from user input to upper case
     */
    public static String getSentenceToUpperCase(String userInput) {
        System.out.println ( "String to upper case '" + userInput.toUpperCase () + "'" );
        return userInput.toUpperCase ();
    }
}
