package StudentParentClass;

import java.util.UUID;

public abstract class Student {

    private String name;
    private String id;
    protected int numberOfModules;

    public Student(String name, int numberOfModules) {
        this.numberOfModules = numberOfModules;
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

    public abstract String returnSubject();

    public abstract int returnNumberOfModules();

}
