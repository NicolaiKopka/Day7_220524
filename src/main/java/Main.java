import StudentParentClass.Student;
import StudentParentClass.CSStudent;
import StudentParentClass.HistoryStudent;
import StudentParentClass.StudentDB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Student student1 = new CSStudent("Raj", 15);
        Student student2 = new HistoryStudent("Mohini", 22);
        List<Student> studentArray = new ArrayList<>(List.of(student1, student2));
        var studentDB = new StudentDB(studentArray);
        Collection<Student> students = studentDB.list();
        System.out.println(studentDB.toString());


    }
}
