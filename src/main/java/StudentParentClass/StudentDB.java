package StudentParentClass;


import java.util.Arrays;
import java.util.List;

public class StudentDB {

    private List<Student> studentsInDB;

    public StudentDB(List<Student> students) {
        this.studentsInDB = students;
    }

    public List<Student> list() {
        return studentsInDB;
    }

    public Student randomStudent(){
        int randomIndex = (int) (Math.random() * studentsInDB.size());
        return studentsInDB.get(randomIndex);
    }

    @Override
    public String toString() {
        String allStudents = "";
        for (Student student : studentsInDB) {
            allStudents += student.getName() + ": " + student.getId() + ";\n";
        }
        return allStudents;
    }
    public void addStudent(Student student) {
        studentsInDB.add(student);
    }

    public void removeStudent(int position) {
        studentsInDB.remove(position - 1);
    }
}
