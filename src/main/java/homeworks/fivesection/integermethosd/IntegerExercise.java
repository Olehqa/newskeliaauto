package homeworks.fivesection.integermethosd;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import jdk.nashorn.internal.parser.JSONParser;

public class IntegerExercise {

    public static Integer firstValue = 111;
    public static Integer secondValue = 111;
    public static String stringForInteger = "1234as";
    public static int intValue = 978945612;
    public static boolean valueForExceptions = true;

    public static void main(String[] args) {
        Integer thirdValue = null;
        try {
            thirdValue = Integer.valueOf(stringForInteger);
        } catch (NumberFormatException e) {
            System.out.println("String do not contains integer value");
        }
        try {
            thirdValue = Integer.valueOf(String.valueOf(valueForExceptions));
        } catch (IllegalArgumentException e) {
            System.out.println("Illigal argument");
        }
        String fourthValue = String.valueOf(123458);
        Integer fifth =
                Integer.valueOf(intValue);
        System.out.println("thirdValue " + thirdValue);
        System.out.println("fourthValue " + fourthValue);
    }
}
