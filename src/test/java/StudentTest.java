import model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StudentTest {

    @Test
    void shouldReturnNameOfStudent() {
        String expected = "Name1";
        Student student1 = new Student("Name1");
        String actual = student1.getName();
        Assertions.assertEquals(expected, actual);
    }

}