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

    private static final Logger LOGGER = LogManager.getLogger(Professions.class);
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

    public static Professions getProfessions(String profName) {
        return valueOf(Professions.class, profName);
    }

    public List<Professions> getAllOfProfessions() {
        return Arrays.asList(Professions.values());
    }

    public static String convertPofToString(Professions inputProf) {
        return inputProf.getProfNameAsString();
    }

    public Integer getNumber() {
        return (number == null ? INDEX_NOT_FOUND : number);
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

    public String getProfNameAsString() {
        return String.valueOf(number);
    }
}