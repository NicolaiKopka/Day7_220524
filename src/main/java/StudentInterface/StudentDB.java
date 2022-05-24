package StudentInterface;

import java.util.Arrays;

public class StudentDB {

    private Student[] studentsInDB;

    public StudentDB(Student[] students) {
        this.studentsInDB = students;
    }

    public Student[] list() {
        return studentsInDB;
    }

    public Student randomStudent(){
        int randomIndex = (int) (Math.random() * studentsInDB.length);
        return studentsInDB[randomIndex];
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
        Student[] newStudentArray = Arrays.copyOf(studentsInDB, studentsInDB.length + 1);
        for (int i = 0; i < newStudentArray.length; i++) {
            if(newStudentArray[i] == null) {
                newStudentArray[i] = student;
            }
        }
        this.studentsInDB = newStudentArray;
    }

    public void removeStudent(int position) {
        Student[] newStudentArray = Arrays.copyOf(studentsInDB, studentsInDB.length - 1);
        int trackIndex = 0;
        for (int i = 0; i < newStudentArray.length; i++) {
            if(i == (position - 1)) {
                trackIndex = i;
            }
            newStudentArray[i] = studentsInDB[i + trackIndex];

        }
        this.studentsInDB = newStudentArray;
    }
}
