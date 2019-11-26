package homework.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadUserTextUtil {


    public static String getStringFromConsole() {
        BufferedReader brStr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please insert some text");
        String sentence = null;
        try {
            sentence = brStr.readLine();
        } catch (IOException e) {
            System.out.println("Wrong value!" + e.getMessage());
        }

        if (sentence == null && sentence.length() == 0) {
            System.out.println("your text is empty");
        }
        return sentence;
    }


    public static char BufferedReaderChar() {
        char symbol = 0;

        BufferedReader brChr = new BufferedReader(new InputStreamReader(System.in));

        try {
            symbol = (char) brChr.read();
            System.out.println("Your symbol is: '" + symbol + "'");
        } catch (Exception e) {
            System.out.println("Wrong value");
        }

        return symbol;

    }

}
