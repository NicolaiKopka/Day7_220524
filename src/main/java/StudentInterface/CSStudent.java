package StudentInterface;

import java.util.UUID;

public class CSStudent implements Student{

    private String name;
    private String id;

    public CSStudent(String name) {
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

    @Override
    public String returnSubject() {
        return "I am a CS student!";
    }
}
