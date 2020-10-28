package homeworks.fivesection.enumpractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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

    private static final Logger LOGGER = LogManager.getLogger(Professions.class);

    public static Integer convertProfToInteger(Professions inputProf) {
        for (Professions professions : Professions.values()) {
            if (professions.getNumber().equals(inputProf.getNumber())) {
                return professions.getNumber();
            }
        }
        return INDEX_NOT_FOUND;
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

    public static Professions getProfessions(String profName) {
        return valueOf(Professions.class, profName);
    }

    public List<Professions> getAllOfProfessions() {
        return Arrays.asList(Professions.values());
    }

    public static void main(String[] args) {

        LOGGER.info("getProfNameAsString: {} ", Professions.DEV.getProfNameAsString());

        LOGGER.info("Proffesion {}", getProfessions("DEV"));

        Professions professions = Professions.PLUMBER;
        Integer value = professions.getNumber();
        LOGGER.info("1. Get PLUMBER as integer value: {}", value);

        String profName = professions.getProfNameAsString();
        LOGGER.info("2. Get as string value: {}", profName);

        professions = Professions.convertIntegerToProf(1);
        LOGGER.info("3. Convert integer to profession: {}", professions);

        professions = Professions.convertStringToProf("Hard Worker");
        LOGGER.info("4. Convert string to profession: {}", professions);

        value = Professions.convertProfToInteger(Professions.TOASTER);
        LOGGER.info("5. Convert profession to integer: {}", value);

        LOGGER.info("5.1. get integer: {}", DEV.getNumber());

        profName = Professions.convertPofToString(Professions.PLUMBER);
        LOGGER.info("6. Convert profession to String: {}", profName);
    }

    public Integer getNumber() {
        if (number == null) {
            return INDEX_NOT_FOUND;
        }
        return number;
    }

    public void printAllOfProfessions() {
        LOGGER.info(getAllOfProfessions());
    }

    public static Professions convertStringToProf(String inputProf) {
        for (Professions professions : Professions.values()) {
            if (professions.getProfName().equals(inputProf)) {
                return professions;
            }
        }
        return null;
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