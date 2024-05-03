import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Management manager = new Management();
        Teacher instruct1 = new Teacher("Teach1", "TeachPass1");
        Teacher instruct2 = new Teacher("Teach2", "TeachPass2");
        Teacher instruct3 = new Teacher("Teach3", "TeachPass3");
        Teacher instruct4 = new Teacher("Teach4", "TeachPass4");
        Teacher instruct5 = new Teacher("Teach5", "TeachPass5");
        Student student1 = new Student("Student1", "StudentPass1");
        Student student2 = new Student("Student2", "StudentPass2");
        Student student3 = new Student("Student3", "StudentPass3");
        Student student4 = new Student("Student4", "StudentPass4");
        Student student5 = new Student("Student5", "StudentPass5");
        student1.addCourse("Web Dev");
        instruct1.addStudent(student1).addStudent(student3).addStudent(student5);
        instruct2.addStudent(student2).addStudent(student4);
        instruct3.addStudent(student3);
        instruct4.addStudent(student1).addStudent(student2).addStudent(student3);
        instruct5.addStudent(student4);
        student1.addCourse("Web Dev").addCourse("Cyber Security");
        student2.addCourse("Java").addCourse("HTML");
        student3.addCourse("Javascript");
        student4.addCourse("Java");
        student5.addCourse("Python");
        manager.addUser(instruct1);
        manager.addUser(instruct2);
        manager.addUser(instruct3);
        manager.addUser(instruct4);
        manager.addUser(instruct5);
        manager.addUser(student1);
        manager.addUser(student2);
        manager.addUser(student3);
        manager.addUser(student4);
        manager.addUser(student5);

        String name, pass;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Username: ");
        name = in.nextLine();
        System.out.print("Enter Password: ");
        pass = in.nextLine();

        User u = new User(name, pass);
        manager.checkUser(u);
/*
        final String[][] users = {
                {"Teach1", "TeachPass1", "1"},
                {"Teach2", "TeachPass2", "1"},
                {"Teach3", "TeachPass3", "1"},
                {"Teach4", "TeachPass4", "1"},
                {"Student1", "StudentPass1", "2"},
                {"Student2", "StudentPass2", "2"},
                {"Student3", "StudentPass3", "2"},
                {"Student4", "StudentPass4", "2"}
        };



        final String[][] courses = {
                {"Java", "Web Dev", "Cyber Security"},
                {"Python", "Web Dev"},
                {"HTML", "CSS", "JavaScript"},
                {"C++"}
        };

        final String[][] instructStudents = {
                {"Student1", "Student2"},
                {"Student2", "Student3"},
                {"Student3", "Student4"},
                {"Student1", "Student2", "Student3"},
        };

        String name, pass;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Username: ");
        name = in.nextLine();
        System.out.print("Enter Password: ");
        pass = in.nextLine();

        for(String[] user: users){
            if(user[0].equals(name) && user[1].equals(pass)){
                if(user[2].equals("1")){
                    System.out.println("Name of instructor: " + user[0]);
                    for(int i = 0; i < instructStudents.length; i++){
                        
                    }
                }else{
                    System.out.println("Name of Student: " + user[0]);
                }
            }else{
                System.out.println("Invalid Username or Password");
            }
        }

        /*
        for (int i = 0; i < instructors.length; i++) {
            if(instructors[i][0].equals(name) && instructors[i][1].equals(pass)) {
                if (instructors[i][1].equals(pass)) {
                    System.out.println("Current Students:");
                    for(int j = 0; j < instructStudents[i].length; j++) {
                        System.out.println("- " + instructStudents[i][j]);
                    }
                    return;
                }
            }
        }
        for (int i = 0; i < students.length; i++) {
            if(students[i][0].equals(name)) {
                if (students[i][1].equals(pass)) {
                    System.out.println("Current Courses:");
                    for (int j = 0; j < courses[i].length; j++) {
                        System.out.println("- " + courses[i][j]);
                    }
                    return;
                }
            }
        }

         */

    }
}