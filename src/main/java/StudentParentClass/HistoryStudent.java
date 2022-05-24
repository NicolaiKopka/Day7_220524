package StudentParentClass;

import java.util.UUID;

public class HistoryStudent extends Student {

    public HistoryStudent(String name, int numberOfModules) {
        super(name, numberOfModules);
    }

    @Override
    public String returnSubject() {
        return "I am a history student!";
    }

    @Override
    public int returnNumberOfModules() {
        return super.numberOfModules;
    }
}
