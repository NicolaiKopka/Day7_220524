import model.Student;
import model.StudentDB;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StudentDBTest {
    @Test
    void shouldReturnListOfAllStudentObjects() {
        Student student1 = new Student("Raj");
        Student student2 = new Student("Mohini");
        Student student3 = new Student("Anjali");
        Student[] studentArray = {student1, student2, student3};
        var studentDB = new StudentDB(studentArray);
        Student[] actual = studentDB.list();

        Assertions.assertArrayEquals(studentArray, actual);
    }

    @Test
    void shouldReturnStudentsAsString() {
        Student student1 = new Student("Raj");
        Student student2 = new Student("Mohini");
        Student student3 = new Student("Anjali");
        Student[] studentArray = {student1, student2, student3};
        var studentDB = new StudentDB(studentArray);
        String expected = "Raj: " + student1.getId() + ";\n" + "Mohini: " + student2.getId() + ";\n" + "Anjali: " + student3.getId() + ";\n";
        String actual = studentDB.toString();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldAddAStudentToDB() {
        Student student1 = new Student("Raj");
        Student student2 = new Student("Mohini");
        Student student3 = new Student("Anjali");
        Student[] studentArray = {student1, student2};
        var studentDB = new StudentDB(studentArray);
        studentDB.addStudent(student3);
        Student[] expected = {student1, student2, student3};
        Student[] actual = studentDB.list();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveAStudentFromDB() {
        Student student1 = new Student("Raj");
        Student student2 = new Student("Mohini");
        Student student3 = new Student("Anjali");
        Student[] studentArray = {student1, student2, student3};
        var studentDB = new StudentDB(studentArray);
        studentDB.removeStudent(2);
        Student[] expected = {student1, student3};
        Student[] actual = studentDB.list();
        Assertions.assertArrayEquals(expected, actual);
    }
}