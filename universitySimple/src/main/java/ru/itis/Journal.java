package ru.itis;

import java.util.HashMap;
import java.util.Map;

public class Journal {
    private Map<String, String> lastNameStudentsWhoNotComing;

    public Journal() {
        lastNameStudentsWhoNotComing = new HashMap<String, String>();
    }

    public void noteNotComing(String studentLastName, String studentReasonNotComing) {
        lastNameStudentsWhoNotComing.put(studentLastName, studentReasonNotComing);
    }

    public Map getStudentMapNotComing() {
        return lastNameStudentsWhoNotComing;
    }
}
