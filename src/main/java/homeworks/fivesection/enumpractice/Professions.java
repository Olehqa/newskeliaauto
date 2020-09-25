package homeworks.fivesection.enumpractice;

import java.util.Arrays;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;

public enum Professions {
    PLUMBER("Hard Worker", 1),
    ACTOR(2),
    DEV("Crying man"),
    QA(4),
    SPY(5),
    TOASTER;

    private Integer number;

    Professions() {
    }

    Professions(String profName) {
        this.profName = profName;
    }

    Professions(Integer number) {
        this.number = number;
    }

    private String profName;

    Professions(String profName, Integer number) {
        this.profName = profName;
        this.number = number;
    }

    public String getProfName() {
        return profName;
    }

    public static Professions convertIntegerToProf(Integer value) {
        for (Professions professions : Professions.values()) {
            if (professions.getNumber().equals(value)) {
                return professions;
            }
        }
        return null;
    }

    public static Integer convertProfToInteger(Professions inputProf) {
        for (Professions professions : Professions.values()) {
            if (null != professions.getNumber() && null != inputProf.getNumber()
                    && professions.getNumber().equals(inputProf.getNumber())) {
                return professions.getNumber();
            }
        }
        return INDEX_NOT_FOUND;
    }

    public List<Professions> getAllOfProfessions() {
        return Arrays.asList(Professions.values());
    }

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

    public static void main(String[] args) {

        System.out.println("getProfNameAsString:" + Professions.DEV.getProfNameAsString());

        System.out.println(getProfessions("DEV").toString());

        Professions professions = Professions.PLUMBER;
        Integer value = professions.getNumber();
        System.out.println("1. Get PLUMBER as integer value: " + value);

        String profName = professions.getProfNameAsString();
        System.out.println("2. Get PLUMBER as string value: " + profName);

        professions = Professions.convertIntegerToProf(1);
        System.out.println("3. Convert integer to profession: " + professions);

        professions = Professions.convertStringToProf("Hard Worker");
        System.out.println("4. Convert string PLUMBER to profession: " + professions);

        value = Professions.convertProfToInteger(Professions.DEV);
        System.out.println("5. Convert DEV profession to integer: " + value);

        System.out.println("5.1. get DEV integer: " + DEV.getNumber());

        profName = Professions.convertPofToString(Professions.PLUMBER);
        System.out.println("6. Convert PLUMBER  to String: " + profName);
    }

    public Integer getNumber() {
        if (null == number) {
            return INDEX_NOT_FOUND;
        }
        return number;
    }

    public static String convertPofToString(Professions inputProf) {
        for (Professions professions : Professions.values()) {
            if (professions.getProfNameAsString().equals(inputProf.getProfNameAsString())) {
                return professions.getProfNameAsString();
            }
        }
        return null;
    }

    public String getProfNameAsString() {
        return String.valueOf(number);
    }
}