package HomeTaskLibraryProvision;



import java.util.ArrayList;
import java.util.List;


public class Student {

    private String surname;
    private String name;

    public Student(String surname, String name) {
        this.surname =surname;
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
