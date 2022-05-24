package model;

import java.util.UUID;

public interface Student {

    String getName();

    String getId();

    @Override
    public String toString();
    String returnSubject();

}
