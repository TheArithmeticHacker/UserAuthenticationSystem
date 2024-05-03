import java.util.Vector;

public class Student extends User{
    public Vector<String> courses;
    Student(String name, String Password){
        this.name = name;
        this.password = Password;
        courses = new Vector<String>();
    }

    void setCourses(Vector<String> courses){
        this.courses = courses;
    }

    Student addCourse(String course){
        courses.add(course);
        return this;
    }

    void show() {
        System.out.println("Name: " + this.name);
        for(String course: courses){
            System.out.println("- "+ course);
        }
    }

}
