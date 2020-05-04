package homeworks.foursection.agregation;

class Employee {

    private String name;
    private String secondName;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name , String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}