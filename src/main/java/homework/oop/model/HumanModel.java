package homework.oop.model;

/**
 * конструктор з всіма параметрами
 * * конструктор з іменами( всі інші параметри приймають значення по замовчуванню
 * додати функцію яка буде формувати підпис людини
 * формувати маленьку біографію
 *
 */

public class HumanModel {

    private String nameOfHuman;
    private String secondNameOfHuman;
    private int ageOfHuman; //update to birth day (Date) and add function to return age
    private String sexOfHuman;
    private String nationalityOfHuman;

    public String getNameOfHuman() {
        return nameOfHuman;
    }

    public void setNameOfHuman(String nameOfHuman) {
        this.nameOfHuman = nameOfHuman;
    }

    public String getSecondNameOfHuman() {
        return secondNameOfHuman;
    }

    public void setSecondNameOfHuman(String secondNameOfHuman) {
        this.secondNameOfHuman = secondNameOfHuman;
    }

    public int getAgeOfHuman() {
        return ageOfHuman;
    }

    public void setAgeOfHuman(int ageOfHuman) {
        this.ageOfHuman = ageOfHuman;
    }

    public String getSexOfHuman() {
        return sexOfHuman;
    }

    public void setSexOfHuman(String sexOfHuman) {
        this.sexOfHuman = sexOfHuman;
    }

    public String getNationalityOfHuman() {
        return nationalityOfHuman;
    }

    public void setNationalityOfHuman(String nationalityOfHuman) {
        this.nationalityOfHuman = nationalityOfHuman;
    }


}
