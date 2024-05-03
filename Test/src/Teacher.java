import java.util.Vector;

public class Teacher extends User{
    public Vector<Student> students;
    Teacher(String name, String password){
        this.name = name;
        this.password = password;
        students = new Vector<Student>();
    }

    void setStudents(Vector<Student> students){
        this.students = students;
    }

    Teacher addStudent(Student student){
        students.add(student);
        return this;
    }

    void show() {
        System.out.println("Name: " + this.name);
        for(Student student : students){
            System.out.println("- " + student.name);
        }
    }


}
