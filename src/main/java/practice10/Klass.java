package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {

    private int number;
    private Student leader;
    private List<Student> students;

    public Klass(int number) {
        this.number = number;
        this.students = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void assignLeader(Student student) {
        if (0 == this.students.size()) {
            System.out.print("It is not one of us.\n");
            return;
        }
        this.leader = student;
    }

    public Student getLeader() {
        return leader;
    }

    public String getDisplayName() {
        return String.format("Class %d", number);
    }

    public void appendMember(Student student) {
        this.students.add(student);
    }

    public boolean isIn(Student student) {
        return student.getKlass().getNumber() == getNumber();
    }
}
