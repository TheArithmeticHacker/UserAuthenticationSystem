import java.util.Objects;
import java.util.Vector;

public class Management {
    public Vector<Student> students;

    public Vector<Teacher> teachers;

    Management(){
        students = new Vector<Student>();
        teachers = new Vector<Teacher>();
    }

    public void addUser(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addUser(Student student) {
        students.add(student);
    }

    public void checkUser(User user){
        for(int i = 0; i < students.size(); i++) {
            if(Objects.equals(students.get(i).name, user.name) && Objects.equals(students.get(i).password, user.password)) {
                students.get(i).show();
                return;
            }
        }
        for(int i = 0; i < teachers.size(); i++) {
            if(Objects.equals(teachers.get(i).name, user.name) && Objects.equals(teachers.get(i).password, user.password)) {
                teachers.get(i).show();
                return;
            }
        }

        System.out.println("There are no users as such on the system");
    }



    public void showAll() {
        System.out.println("Teachers: ");
        if(teachers.size() > 0) {
            for(int i = 0; i < teachers.size(); i++) {
                System.out.println("- "  + teachers.get(i).name);
            }
        }else{
            System.out.println("There are no teachers on the system");
        }

        System.out.println("Students: ");
        if(students.size() > 0) {
            for(int i = 0; i < students.size(); i++) {
                System.out.println("- "  + students.get(i).name);
            }
        }else{
            System.out.println("There are no students on the system");
        }
    }


}
