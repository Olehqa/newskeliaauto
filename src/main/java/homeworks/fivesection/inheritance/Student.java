package homeworks.fivesection.inheritance;

public final class Student extends AbstractHuman {

    private String speciality;
    private String groupName;
    private int course;

    public Student() {
        super();
    }

    public Student(String firstName, String secondName) {
        super(firstName, secondName);
    }

    public Student(String firstName, String secondName, String speciality, String groupName, int course) {
        super(firstName, secondName);
        this.speciality = speciality;
        this.groupName = groupName;
        this.course = course;
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

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setGroupName(String nativeLanguage) {
        this.groupName = groupName;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String getBio() {
        return String.format("The bio of student should not be so long for %s, %s", getFirstName(), getLastName());
    }

    public boolean equals(Object otherStudent) {

        if (this == otherStudent) {
            return true;
        }

        if (otherStudent == null) {
            return false;
        }

        if (getClass() != otherStudent.getClass()) {
            return false;
        }

        Student other = (Student) otherStudent;
        return getFirstName().equals(other.getFirstName()) && getLastName().equals(other.getFirstName())
                && getSpeciality().equals(other.getSpeciality()) && getGroupName().equals(other.getGroupName())
                && getCourse() == (other.getCourse());
    }
}
