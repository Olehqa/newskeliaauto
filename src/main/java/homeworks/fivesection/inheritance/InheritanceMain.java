package homeworks.fivesection.inheritance;

import java.util.ArrayList;

public class InheritanceMain {

    public static void main(String[] args) {
        AbstractHuman hum = new Student("Manu", "Pkiao");
        AbstractHuman hum2 = new Employee("Alice", "Kimble", "oldProfession");
        Student student1 = new Student("Funtic", "Puntiki");
        Student student2 = new Student("Funt", "Ptik");
        Student student3 = new Student("Tic", "Pik");
        Student student4 = new Student("Unti", "Tik");
        Student student5 = new Student("Cit", "Punktik");
        Student student6 = new Student("Ftic", "Piontik");
        Student student7 = new Student("Fuc", "Suntic");

        AbstractHuman humanAbs = new AbstractHuman() {
            @Override
            public String getBio() {
                System.out.println("Bio from overrated method from abstract");
                return null;
            }
        };

        humanAbs.getBio();
        System.out.println(hum.getFirstName());
        System.out.println(hum.getBio());
        System.out.println(hum2.getBio());

        if (hum.equals(hum2)) {
            System.out.println("Object are equal");
        } else {
            System.out.println("Object are not equal");
        }
        Student[] arr = {student1};


        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
    }
}