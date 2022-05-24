import model.CSStudent;
import model.HistoryStudent;
import model.Student;
import model.StudentDB;

public class Main {

    public static void main(String[] args) {
        Student student1 = new CSStudent("Raj");
        Student student2 = new CSStudent("Mohini");
        Student student3 = new HistoryStudent("Anjali");
        Student[] studentArray = {student1, student2, student3};
        var studentDB = new StudentDB(studentArray);
        System.out.println(studentDB.toString());
        studentDB.removeStudent(2);
        System.out.println(studentDB.toString());
    }
}
