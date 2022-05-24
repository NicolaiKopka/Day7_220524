package StudentParentClass;

import java.util.UUID;

public class HistoryStudent extends Student {

    public HistoryStudent(String name) {
        super(name);
    }

    @Override
    public String returnSubject() {
        return "I am a history student!";
    }
}
