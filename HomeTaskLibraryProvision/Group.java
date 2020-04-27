package HomeTaskLibraryProvision;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class  Group {


    private List<Student> students = new ArrayList();

    public List<Student> getGroup() {
        return students;
    }

    public void setGroup(List<Student> students) {
        this.students = students;
    }

    public void add(Student student)
  {
      this.students.add(student);
  }
    public void delStudent (Student student)
    {
        this.students.remove(student);
    }
    public void renameStudent(Student student, String surname, String name)
    {
        student.setSurname(surname);
        student.setName(name);


    }
    @Override
    public String toString() {
        return "Group{" +
                "students=" + students +
                '}';
    }

    public void printAll() {
        Iterator var1 = this.students.iterator();

        while(var1.hasNext()) {
            Student students = (Student) var1.next();
            System.out.println(students);
        }



    }

}
