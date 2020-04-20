package homeworks.foursection.agregation;

import javax.naming.Name;

public class Employee {

    String name = "";



    String secondName = "";

    public Employee(){
           }
    public Employee(String name){
    }
    public Employee(String name, String secondName){
    }


    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
