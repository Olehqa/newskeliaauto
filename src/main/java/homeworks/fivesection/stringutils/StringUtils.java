package homeworks.fivesection.stringutils;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.util.regex.Pattern;

public class StringUtils {

    public static boolean isValidByOWASP(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pat = Pattern.compile ( emailRegex );
        if (email == null) {
            return false;
        }
        return pat.matcher ( email ).matches ();
    }

    public static boolean isValidEmailAddressByJavaLibrary(String email) {
        boolean result = true;
        try {
            InternetAddress emailAddr = new InternetAddress ( email );
            emailAddr.validate ();
        } catch (AddressException ex) {
            result = false;
        }
        return result;
    }

    public static String getEmailDomain(String fileWithExtension) {
        return fileWithExtension.substring ( fileWithExtension.lastIndexOf ( '@' ) + 1 );
    }

    public static void main(String[] args) {
        String email = "contribute@org.";
        if (isValidByOWASP ( email )) {
            System.out.print ( "Email valid" );
        } else {
            System.out.print ( "Email invalid due to OWASP \n" );
        }

        if (isValidEmailAddressByJavaLibrary ( email )) {
            System.out.print ( "Yes, email valid" );
        } else {
            System.out.print ( "No, email invalid due to Java library" );
        }
    }
}

