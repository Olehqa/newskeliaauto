package homeworks.foursection;

public class StringModifiengExample {

    public static void main(String[] args) {
        String initialValue = "InitialValue";
        getSentenceViseVersa ( initialValue );
        printString78(initialValue);

        System.out.println ("initial value: "+ initialValue);
//        System.out.println ("changed value: " + getSentenceViseVersa ( initialValue ));

    }

    public static String getSentenceViseVersa(String userInput) {

        String viseVersaSentence = "";

        for (int i = userInput.length () - 1; i >= 0; i--) {
            viseVersaSentence = viseVersaSentence + userInput.charAt ( i );
        }

//        System.out.println ( "Reversed string is:" );
//        System.out.println ( viseVersaSentence );

        System.out.println ();
        return viseVersaSentence;
    }

    public static void printString78(String userInput){
        String viseVersaSentence = "";

        for (int i = userInput.length () - 1; i >= 0; i--) {
            viseVersaSentence = viseVersaSentence + userInput.charAt ( i );
        }
        System.out.println ( "in void method: " + viseVersaSentence);
    }


}
