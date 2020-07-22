package practice09;


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

    public String getDisplayName() {
        return String.format("Class %d", this.number);
    }

    public void assignLeader(Student student) {
        if (this.students.size() == 0) {
            System.out.print("It is not one of us.\n");
            return;
        }
        this.leader = student;
    }

    public Student getLeader() {
        return this.leader;
    }

    public void appendMember(Student student) {
        this.students.add(student);
    }

}
