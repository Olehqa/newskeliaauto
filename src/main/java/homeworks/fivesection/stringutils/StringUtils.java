package homeworks.fivesection.stringutils;

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

    public static boolean isEmailValid(String email) {
        if (email == null || email.isEmpty ()) {
            return false;
        } else if (email.length () > 256) {
            return false;
        } else if (getEmailDomain ( email ).length () > 255) {
            return false;
        } else if (getLocalPart ( email ).length () > 64) {
            return false;
        } else if (getLocalPart ( email ).length () >= 1) {
            return false;
        } else if (getEmailDomain ( email ).substring ( getEmailDomain ( email ).indexOf ( '.' ) , email.lastIndexOf ( email ) ).length () > 7) {
            return false;
        } else if (!email.contains ( "@" )) {
            return false;
        } else if (getLocalPart ( email ).indexOf ( '0' ) != '.') {
            return false;
        } else return email.lastIndexOf ( getLocalPart ( email ) )  != '.';

    }

    public static String getLocalPart(String email) {
        return email.substring ( 0 , email.indexOf ( '@' ) );
    }

    public static String getEmailDomain(String email) {
        return email.substring ( email.lastIndexOf ( '@' ) + 1 );
    }

    public static void main(String[] args) {
        String email = "contribute@org.";
        if (isValidByOWASP ( email )) {
            System.out.print ( "Email valid" );
        } else {
            System.out.print ( "Email invalid due to OWASP \n" );
        }
    }
}

