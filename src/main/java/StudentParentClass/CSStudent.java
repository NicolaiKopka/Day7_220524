package StudentParentClass;

import java.util.UUID;

public class CSStudent extends Student {


    public CSStudent(String name, int numberOfModules) {
        super(name, numberOfModules);
    }

    @Override
    public String returnSubject() {
        return "I am a CS student!";
    }

    @Override
    public int returnNumberOfModules() {
        return super.numberOfModules;
    }
}
