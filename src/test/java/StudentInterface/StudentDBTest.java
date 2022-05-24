package StudentInterface;

import StudentInterface.CSStudent;
import StudentInterface.HistoryStudent;
import StudentInterface.Student;
import StudentInterface.StudentDB;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class StudentDBTest {
    @Test
    void shouldReturnListOfAllStudentObjects() {
        Student student1 = new CSStudent("Raj");
        Student student2 = new CSStudent("Mohini");
        Student student3 = new HistoryStudent("Anjali");
        List<Student> studentArray = new ArrayList<>(List.of(student1, student2, student3));
        var studentDB = new StudentDB(studentArray);
        List<Student> actual = studentDB.list();
        Assertions.assertEquals(studentArray, actual);
    }

    @Test
    void shouldReturnStudentsAsString() {
        Student student1 = new CSStudent("Raj");
        Student student2 = new CSStudent("Mohini");
        Student student3 = new HistoryStudent("Anjali");
        List<Student> studentArray = new ArrayList<>(List.of(student1, student2, student3));
        var studentDB = new StudentDB(studentArray);
        String expected = "Raj: " + student1.getId() + ";\n" + "Mohini: " + student2.getId() + ";\n" + "Anjali: " + student3.getId() + ";\n";
        String actual = studentDB.toString();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldAddAStudentToDB() {
        Student student1 = new CSStudent("Raj");
        Student student2 = new CSStudent("Mohini");
        Student student3 = new HistoryStudent("Anjali");
        List<Student> studentArray = new ArrayList<>(List.of(student1, student2));
        var studentDB = new StudentDB(studentArray);
        studentDB.addStudent(student3);
        List<Student> expected = new ArrayList<>(List.of(student1, student2, student3));
        List<Student> actual = studentDB.list();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldRemoveAStudentFromDB() {
        Student student1 = new CSStudent("Raj");
        Student student2 = new CSStudent("Mohini");
        Student student3 = new HistoryStudent("Anjali");
        List<Student> studentArray = new ArrayList<>(List.of(student1, student2, student3));
        var studentDB = new StudentDB(studentArray);
        studentDB.removeStudent(2);
        List<Student> expected = new ArrayList<>(List.of(student1, student3));
        List<Student> actual = studentDB.list();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnCSStringIfStudentIsOfClassCSStudent() {
        Student student1 = new CSStudent("Raj");
        Student student2 = new HistoryStudent("Anjali");
        List<Student> studentArray = new ArrayList<>(List.of(student1, student2));
        var studentDB = new StudentDB(studentArray);
        List<Student> students = studentDB.list();
        String expected = "I am a CS student!";
        String actual = students.get(0).returnSubject();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnHistoryStringIfStudentIsOfClassHistoryStudent() {
        Student student1 = new CSStudent("Raj");
        Student student2 = new HistoryStudent("Anjali");
        List<Student> studentArray = new ArrayList<>(List.of(student1, student2));
        var studentDB = new StudentDB(studentArray);
        List<Student> students = studentDB.list();
        String expected = "I am a history student!";
        String actual = students.get(1).returnSubject();
        Assertions.assertEquals(expected, actual);
    }
}