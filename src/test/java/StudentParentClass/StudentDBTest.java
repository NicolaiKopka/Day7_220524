package StudentParentClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

class StudentDBTest {
    @Test
    void shouldReturnListOfAllStudentObjects() {
        Student student1 = new CSStudent("Raj", 15);
        Student student2 = new CSStudent("Mohini", 15);
        Student student3 = new HistoryStudent("Anjali", 22);
        List<Student> studentArray = new ArrayList<>(List.of(student1, student2, student3));
        var studentDB = new StudentDB(studentArray);
        Collection<Student> allStudents = studentDB.list();
        int actual = studentDB.list().size();
        Assertions.assertEquals(3, actual);
        Assertions.assertTrue(allStudents.containsAll(studentArray));
    }

    @Test
    void shouldAddAStudentToDB() {
        Student student1 = new CSStudent("Raj", 15);
        Student student2 = new CSStudent("Mohini", 15);
        Student student3 = new HistoryStudent("Anjali", 22);
        List<Student> studentArray = new ArrayList<>(List.of(student1, student2));
        var studentDB = new StudentDB(studentArray);
        studentDB.addStudent(student3.getId(), student3);
        Collection<Student> expected = new ArrayList<>(List.of(student1, student2, student3));
        Collection<Student> actualList = studentDB.list();
        int actual = studentDB.list().size();
        Assertions.assertEquals(3, actual);
        Assertions.assertTrue(actualList.containsAll(expected));
    }

    @Test
    void shouldRemoveAStudentFromDB() {
        Student student1 = new CSStudent("Raj", 15);
        Student student2 = new CSStudent("Mohini", 15);
        Student student3 = new HistoryStudent("Anjali", 22);
        List<Student> studentArray = new ArrayList<>(List.of(student1, student2, student3));
        var studentDB = new StudentDB(studentArray);
        studentDB.removeStudent(student2.getId());
        List<Student> remainingStudents = new ArrayList<>(List.of(student1, student3));
        Collection<Student> actual = studentDB.list();
        int actualLength = studentDB.list().size();
        Assertions.assertEquals(2, actualLength);
        Assertions.assertTrue(actual.containsAll(remainingStudents));
    }

    @Test
    void shouldFailIfIdAlreadyExists() {
        Student student1 = new CSStudent("Raj", 15);
        List<Student> studentArray = new ArrayList<>(List.of(student1));
        var studentDB = new StudentDB(studentArray);
        try {
            studentDB.addStudent(student1.getId(), student1);
            Assertions.fail();
        } catch (RuntimeException e) {}

    }
}