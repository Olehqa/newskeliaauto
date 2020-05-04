package homeworks.foursection;

public class StringModifyingExample {

    public static void main(String[] args) {
        String initialValue = "InitialValue";
        initialValue = getChagdedUseInput ( initialValue );
        String initialValue2 = "InitialValue";
        sentenceViseVersa ( initialValue2 );

        System.out.println ( "initial value: " + initialValue );
        System.out.println ( "initial value2: " + initialValue2 );
 }

    public static String getChagdedUseInput(String userInput) {
        userInput = userInput.replaceAll ( "i" , "a" );
        return userInput;
    }

    public static void sentenceViseVersa(String userInput) {
        userInput = userInput.replaceAll ( "i" , "a" );
    }
}