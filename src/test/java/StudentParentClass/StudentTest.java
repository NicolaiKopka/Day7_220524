package StudentParentClass;

import StudentInterface.CSStudent;
import StudentInterface.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StudentTest {

    @Test
    void shouldReturnNameOfStudent() {
        String expected = "Name1";
        Student student1 = new CSStudent("Name1");
        String actual = student1.getName();
        Assertions.assertEquals(expected, actual);
    }

}