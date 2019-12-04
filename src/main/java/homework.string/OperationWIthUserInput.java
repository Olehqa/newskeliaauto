package homework.string;

public class OperationWIthUserInput {

    /**
     * Count letters on user inputs from console
     */

    public static int getTextLength(String userInput) {
        System.out.println ( "Sentence length is: " + userInput.length () );
        System.out.println ();

        return userInput.length ();
    }

    /**
     * Count chosen by user letter in sentence
     **/

    public static long countLetters(String userInput) {
        boolean containsOrNot;
        int countLetters1 = 0;

        ContentVerification contVerification1 = new ContentVerification ();

        System.out.println ( "Please Inset a symbol what should count: " );
        char symbol;
        do {

            symbol = ReadUserTextUtil.BufferedReaderChar ();
            containsOrNot = contVerification1.verifyUserCharInput ( userInput , symbol );

        } while (!containsOrNot);


        for (int i = 0; userInput.length () - 1 >= i; i++) {

            char charAt = userInput.charAt ( i );
            if (charAt == symbol) {
                countLetters1++;

            }
        }

        System.out.println ( "There are " + countLetters1 + " of '" + symbol + "' symbol in your '"
                + userInput + "' input " );
        System.out.println ();
        return countLetters1;
    }


    /**
     * Change one symbol to new one
     */

    public static String changeSymbolFromOldToNew(String userInput) {
        char oldSymbol;
        char newSymbol;

        boolean containsYesNo1;
        ContentVerification contVerification2 = new ContentVerification ();


        System.out.println ( "Inset symbol what should change in this '" + userInput + "'" + " sentence" );

        do {
            oldSymbol = ReadUserTextUtil.BufferedReaderChar ();
            containsYesNo1 = contVerification2.verifyUserCharInput ( userInput , oldSymbol );

        } while (!containsYesNo1);

        System.out.println ( "Inset symbol to what should change: " );

        newSymbol = ReadUserTextUtil.BufferedReaderChar ();

        System.out.println ( "old char: '" + oldSymbol + "'" + "; new char: '" + newSymbol + "'" );

        System.out.println ( "Sentence with changed symbols '" + userInput.replace ( oldSymbol , newSymbol ) + "'" );

        System.out.println ();

        return userInput.replace ( oldSymbol , newSymbol );
    }


    /**
     * Convert user input to array
     */

    public static char[] sentenceToArray(String userInput) {

        System.out.println ( "Sentence as array of chars -" );
        char[] StringToArr = userInput.toCharArray ();
        for (char output : StringToArr)
            System.out.println ( output );
        return StringToArr;
    }


    /**
     * Trim a part of user input from letter1 to letter2
     */

    public static String getPartOfSentence(String userInput) {
        char firstSymbol;
        char lastSymbol;
        boolean containsYesNo2;
        boolean containsYesNo3;

        ContentVerification contVerification3 = new ContentVerification ();
        ContentVerification contVerification4 = new ContentVerification ();
        System.out.println ( "Inset symbol from what should trim: " );
        do {
            firstSymbol = ReadUserTextUtil.BufferedReaderChar ();
            containsYesNo2 = contVerification3.verifyUserCharInput ( userInput , firstSymbol );

        } while (!containsYesNo2);

        System.out.println ( "Inset symbol till what should trim: " );
        do {
            lastSymbol = ReadUserTextUtil.BufferedReaderChar ();
            containsYesNo3 = contVerification4.verifyUserCharInput ( userInput , firstSymbol );
            if (userInput.indexOf ( firstSymbol ) > userInput.lastIndexOf ( lastSymbol )) {

                System.out.println ( "Еhe last character is located earlier than the first." +
                        " Please try again" );

                containsYesNo3 = false;
            }

        } while (!containsYesNo3);


        userInput = userInput.substring ( userInput.indexOf ( firstSymbol ) ,
                userInput.lastIndexOf ( lastSymbol ) + 1 );

        System.out.println ( "Your trimed sentence is '" + userInput + "'" );
        System.out.println ();

        return userInput;
    }

    /**
     * Display index(es) of some symbol
     */

    public static void getIndexOfSymbols(String userInput) {
        ContentVerification contVer2 = new ContentVerification ();
        char symbolForIndex;
        boolean conditionYesNo5;

        System.out.println ( "Please insert symbol from what should return index(es) " );

        do {
            symbolForIndex = ReadUserTextUtil.BufferedReaderChar ();
            conditionYesNo5 = contVer2.verifyUserCharInput ( userInput , symbolForIndex );
        } while (!conditionYesNo5);

        for (int s = -1; (s = userInput.indexOf ( symbolForIndex , s + 1 )) != -1; s++) {
            System.out.println ( "index(es) of the symbol() s - " + s );
        }
        System.out.println ();

    }

    /**
     * Display user input form last letter to first
     */

    public static String viceVersa(String userInput) {

        String reverse = "";

//        for (int i = userInput.length() - 1; i >= 0; i--) {
//            reverse = reverse + userInput.charAt(i);
//        }

        System.out.println ( "Reversed string is:" );
        System.out.println ( reverse );

        System.out.println ();
        return reverse;
    }

    /**
     * Convert all the letters from user input to lover case
     */

    public static String toLoverCase(String userInput) {
        System.out.println ( "String to lover case '" + userInput.toLowerCase () + "'" );
        return userInput.toLowerCase ();
    }


    /**
     * Convert all the letters from user input to upper case
     */
    public static String toUpperCase(String userInput) {
        System.out.println ( "String to upper case '" + userInput.toUpperCase () + "'" );
        return userInput.toUpperCase ();
    }
}
