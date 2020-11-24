package homeworks.fivesection.enumpractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static homeworks.fivesection.enumpractice.Professions.DEV;
import static homeworks.fivesection.enumpractice.Professions.getProfessions;

public class EnumPracticeMain {
    private static final Logger LOGGER = LogManager.getLogger(EnumPracticeMain.class);

    public static void main(String[] args) {

        LOGGER.info("getProfNameAsString: {} ", DEV.getProfNameAsString());

        LOGGER.info("Proffesion {}", getProfessions("DEV"));

        Professions professions = Professions.PLUMBER;
        Integer value = professions.getNumber();
        LOGGER.info("1. Get PLUMBER as integer value: {}", value);

        String profName = professions.getProfNameAsString();
        LOGGER.info("2. Get as string value: {}", profName);

        professions = Professions.convertStringToProf("Hard Worker");
        LOGGER.info("3. Convert string to profession: {}", professions);

        LOGGER.info("5.1. get integer: {}", DEV.getNumber());

        profName = Professions.convertPofToString(Professions.PLUMBER);
        LOGGER.info("5. Convert profession to String: {}", profName);
    }
}
