package StudentParentClass;

import java.util.UUID;

public class Student {

    private String name;
    private String id;

    public Student(String name) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String returnSubject() {
        return "I am a Student";
    }

}
