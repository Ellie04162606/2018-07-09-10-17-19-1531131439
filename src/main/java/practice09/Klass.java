package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    List<Student> students = new ArrayList<Student>();

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student student) {
        if (students.contains(student)) {
            leader = student;
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public String getDisplayName() {
        return "Class " + getNumber();
    }

    public void appendMember(Student student) {
        students.add(student);
    }
}
