import StudentParentClass.Student;
import StudentParentClass.CSStudent;
import StudentParentClass.HistoryStudent;
import StudentParentClass.StudentDB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Student student1 = new CSStudent("Raj");
//        Student student2 = new CSStudent("Mohini");
//        Student student3 = new HistoryStudent("Anjali");
//        Student[] studentArray = {student1, student2, student3};
//        var studentDB = new StudentDB(studentArray);
//        System.out.println(studentDB.toString());
//        studentDB.removeStudent(2);
//        System.out.println(studentDB.toString());

        Student student1 = new CSStudent("Raj", 15);
        Student student2 = new HistoryStudent("Mohini", 22);
        List<Student> studentArray = new ArrayList<>(List.of(student1, student2));
        var studentDB = new StudentDB(studentArray);
        List<Student> students = studentDB.list();
        System.out.println(students.get(0).returnSubject());
        System.out.println(student1.returnNumberOfModules());
        System.out.println(students.get(1).returnSubject());
        System.out.println(student2.returnNumberOfModules());

    }
}
