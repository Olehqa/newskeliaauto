package homeworks.fivesection.enumpractice;

import java.util.Arrays;
import java.util.List;

public enum Professions {
    PLUMBER("Hard Worker", 1), ACTOR(2), DEV("Crying man"), QA(4), SPY(5);

    private String profName;
    private Integer value;

    public String getProfName() {
        return profName;
    }

    public Integer getValue() {
        return value;
    }

    public String getProfNameAsString() {
        return String.valueOf(value);
    }
    public String getProfIntegerAsString() {

        return String.valueOf(profName);
    }

    // empty constructors

    Professions() {
    }

    //constructors for String
    Professions(String profName) {
        this.profName = profName;
    }

    //constructors for Integer
    Professions(Integer value) {
        this.value = value;
    }

    //constructors for String and Integer
    Professions(String profName, Integer value) {
        this.profName = profName;
        this.value = value;
    }

    //return all professions
    public List<Professions> getAllOfProfessions() {
        return Arrays.asList(Professions.values());
    }

    //print all professions
    public void printAllOfProfessions() {
        System.out.println(getAllOfProfessions());
    }

    public static Professions getProfessions(String profName) {
        return Professions.valueOf(Professions.class, profName);
    }

    public static Professions convertStringToProf(String inputProf) {
        for (Professions professions : Professions.values()) {
            if (professions.getProfName().equals(inputProf)) {
                return professions;
            }
        }
        return null;
    }


    public static Professions convertIntegerToProf(Integer value) {
        for (Professions professions : Professions.values()) {
            if (professions.getValue().equals(value)) {
                return professions;
            }
        }
        return null;
    }

    public static Integer convertProfToInteger(Professions inputProf) {
        for (Professions professions : Professions.values()) {
            if (professions.getValue().equals(inputProf.getValue())) {
                return professions.getValue();
            }
        }
        return -1;
    }

    public static String convertPofToString(Professions inputProf) {
        for (Professions professions : Professions.values()) {
            if (professions.getProfNameAsString().equals(inputProf.getProfNameAsString())) {
                return professions.getProfNameAsString();
            }
        }
        return null;
    }


    public static void main(String[] args) {

        System.out.println(Professions.DEV.getProfNameAsString());

        System.out.println(getProfessions("DEV").toString());

        Professions professions = Professions.PLUMBER;
        Integer value = professions.getValue();
        String profName = professions.getProfNameAsString();

        // Get profession as integer value
        System.out.println("1. Get PLUMBER as int value: " + value);
        // Get profession as String value
        System.out.println("2. Get PLUMBER color as string value: " + profName);

        professions = Professions.convertIntegerToProf(1);
        // Convert integer value to corresponding profession value
        System.out.println("3. Convert integer 1 to profession: " + professions);

        professions = Professions.convertStringToProf("Hard Worker");
        // Convert String value to corresponding profession value
        System.out.println("4. Convert string PLUMBER to profession: " + professions);

        value = Professions.convertProfToInteger(Professions.PLUMBER);
        // Convert profession value to corresponding integer value
        System.out.println("5. Convert DEV profession to integer:" + value);

        profName = Professions.convertPofToString(Professions.PLUMBER);
        // Convert profession value to corresponding integer value
        System.out.println("6. Convert PLUMBER to String: " + profName);
    }
}