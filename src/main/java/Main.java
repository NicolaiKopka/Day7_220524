import StudentParentClass.Student;
import StudentParentClass.CSStudent;
import StudentParentClass.HistoryStudent;
import StudentParentClass.StudentDB;

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

        Student student1 = new CSStudent("Raj");
        Student student2 = new Student("Mohini");
        Student[] studentArray = {student1, student2};
        var studentDB = new StudentDB(studentArray);
        Student[] students = studentDB.list();
        System.out.println(students[0].returnSubject());
        System.out.println(students[1].returnSubject());

    }
}
