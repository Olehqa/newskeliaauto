package homeworks.fivesection.enumpractice;

import java.util.Arrays;
import java.util.List;

public enum Professions {
    PLUMBER("Hard Worker"), ACTOR(2), DEV("Crying man"), QA(4), SPY(5);

    private String profName;
    private Integer value;

    public String getProfName() {
        return profName;
    }

    public Integer getValue() {
        return value;
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

    //print all professions
    public void PrintAllOfProfessions() {
        List<Professions> numbersToSort = Arrays.asList(Professions.values());
        System.out.println(numbersToSort);
    }

    //return all professions
    public List<Professions> getAllOfProfessions() {
        return Arrays.asList(Professions.values());
    }

    public Professions getValueOfEnumName(String name) {
        Professions integerValueOf = Enum.valueOf(Professions.class, name);
        System.out.println(integerValueOf);
        return integerValueOf;
    }

    public String getProfessionsAsString(Integer value) {
        return String.valueOf(value);
    }

    public String getProfessionsAsString(Professions professions) {
        return String.valueOf(professions);
    }


    public static void main(String[] args) {

//        Professions newEmptyProf = new Professions();
//        Professions newEmptyProf2 = Professions.valueOf(2);
//        Professions newEmptyProf3 = Professions.valueOf("LAZYMAN");
//        Professions newEmptyProf4 = Professions.valueOf();

    }


}