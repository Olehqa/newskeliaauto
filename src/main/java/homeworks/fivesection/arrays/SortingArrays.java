package homeworks.fivesection.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SortingArrays {

    public static int userInputsFromConsole = 0;
    public static String more;
    public static int sortedNumbers;
    public static boolean conditionsYesNo;
    public static String ascOrDesc;


    public static void main(String[] args) {

        sortArray ();

    }

    /*Sorting digits to arr  */
    public static int sortArray() {

        /*Reading from user inputs and validate*/
        do {
            BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );
            System.out.println ( "Please insert several digits for sorting:" );

            try {
                userInputsFromConsole = Integer.parseInt ( br.readLine () );
                System.out.println ( userInputsFromConsole );
            } catch (IOException e) {

                System.out.println ( "You can type only digits! Please type Yes(Y) for retry ?" );
            }

            if (userInputsFromConsole > 0) {

                System.out.println ( "You digits for sorting " + userInputsFromConsole );


                String strNumber = userInputsFromConsole + "";

                System.out.println ( "howDigitsLooks on String = " + strNumber );

                int[] arrayOfNumbers = new int[strNumber.length ()];

                int index = 0;
                System.out.println ( "How arrays looks in int " );
                for (char c : strNumber.toCharArray ()) {

                    arrayOfNumbers[index++] = Integer.parseInt ( c + "" );
                    System.out.print ( c );
                }
                System.out.println ();

                do {
                    System.out.println ( "Please choose how to sort: ASC type (a) or DESC type (d) " );
                    try {
                        ascOrDesc = br.readLine ();
                    } catch (IOException e) {
                        conditionsYesNo = false;
                        System.out.println ( "Wrong value please retry" );

                    }

                    /*Sorting by ASC*/
                    if (ascOrDesc.equalsIgnoreCase ( "a" )) {
                        conditionsYesNo = true;
                        System.out.println ( "Lets sort ASC" );
                        int povtoriv = 0;
                        boolean vidbulasZamina = true;
                        while (vidbulasZamina) {
                            vidbulasZamina = false;
                            for (int i = 0; i < arrayOfNumbers.length - 1 - povtoriv; i++) {
                                if (arrayOfNumbers[i] > arrayOfNumbers[i + 1]) {
                                    int temporaryVariable = arrayOfNumbers[i];
                                    arrayOfNumbers[i] = arrayOfNumbers[i + 1];
                                    arrayOfNumbers[i + 1] = temporaryVariable;
                                    vidbulasZamina = true;
                                }
                            }
                            povtoriv++;

                        }
                        for (int i : arrayOfNumbers) {
                            System.out.print ( i + " " );
                        }
                        /*Sorting by DESC*/
                    } else if (ascOrDesc.equalsIgnoreCase ( "d" )) {
                        conditionsYesNo = true;
                        System.out.println ( "Lets sort DESC" );
                        int povtoriv = 0;
                        boolean vidbulasZamina = true;
                        while (vidbulasZamina) {
                            vidbulasZamina = false;
                            for (int i = 0; i < arrayOfNumbers.length - 1 - povtoriv; i++) {
                                if (arrayOfNumbers[i] < arrayOfNumbers[i + 1]) {
                                    int temporaryVariable = arrayOfNumbers[i];
                                    arrayOfNumbers[i] = arrayOfNumbers[i + 1];
                                    arrayOfNumbers[i + 1] = temporaryVariable;
                                    vidbulasZamina = true;
                                }
                            }
                            povtoriv++;
//                            System.out.println ( "povtoriv = " + povtoriv );

                        }
                        for (int i : arrayOfNumbers) {
                            System.out.print ( i + " " );
                        }
                    }
                } while (conditionsYesNo == false);

            } else
                try {
                    more = br.readLine ();
                    if (more.equalsIgnoreCase ( "y" )) {
                        conditionsYesNo = true;
                    } else {
                        System.out.println ( "You type wrong value!" );
                        conditionsYesNo = false;
                    }
                } catch (Exception e) {
                    System.out.println ( "Wrong value" );
                }

        } while (conditionsYesNo == false);

        return sortedNumbers;
    }
}
