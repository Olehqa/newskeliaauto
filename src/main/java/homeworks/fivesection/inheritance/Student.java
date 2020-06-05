package homeworks.fivesection.inheritance;

import com.sun.javafx.binding.StringFormatter;

public final class Student extends Human {

    private String firstName;
    private String secondName;
    private String nativeLanguage;
    private String speciality;
    private String groupName;
    private int course;

    public Student(String firstName , String secondName) {
    }

    public Student(String firstName , String secondName , String speciality , String groupName , int course) {
    }

    public Student(String firstName , String secondName , String nativeLanguage , String speciality , String groupName , int course) {
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getSecondName() {
        return secondName;
    }

    @Override
    public String getNativeLanguage() {
        return nativeLanguage;
    }

    public String getBio() {

        return String.format ( "The bio should not so long for \n , \n" , getFirstName () , getSecondName () );
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getGroupName() {
        return groupName;
    }

    public int getCourse() {
        return course;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setNativeLanguage(String nativeLanguage) {
        this.nativeLanguage = nativeLanguage;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setGroupName(String nativeLanguage) {
        this.groupName = groupName;
    }

    public void setCourse(int course) {
        this.course = course;
    }


}
