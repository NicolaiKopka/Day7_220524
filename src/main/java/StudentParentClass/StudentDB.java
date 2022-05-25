package StudentParentClass;


import java.util.*;

public class StudentDB {

    private Map<String, Student> studentsInDB;

    public StudentDB(List<Student> students) {
        this.studentsInDB = new HashMap<>();
        for (Student student : students) {
            this.studentsInDB.put(student.getId(), student);
        }
    }

    public Collection<Student> list() {
        return studentsInDB.values();
    }

    public Student randomStudent(){
        int randomIndex = (int) (Math.random() * studentsInDB.size());
        return new ArrayList<>(studentsInDB.values()).get(randomIndex);
    }

    @Override
    public String toString() {
        StringBuilder allStudents = new StringBuilder();
        for (Map.Entry<String, Student> entry: studentsInDB.entrySet()) {
            allStudents.append("ID: ");
            allStudents.append(entry.getKey());
            allStudents.append(": ");
            allStudents.append(entry.getValue());
            allStudents.append(";\n");
        }
        return allStudents.toString();
    }
    public void addStudent(String id, Student student) {
        if(studentsInDB.containsKey(id)) {
            throw new RuntimeException("Student already exists");
        }
        studentsInDB.putIfAbsent(id, student);
    }

    public void removeStudent(String id) {
        studentsInDB.remove(id);
    }
}
