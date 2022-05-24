package StudentParentClass;

import java.util.UUID;

public class CSStudent extends Student {


    public CSStudent(String name) {
        super(name);
    }

    @Override
    public String returnSubject() {
        return "I am a CS student!";
    }
}
