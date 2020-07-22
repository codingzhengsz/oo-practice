package practice02;

public class Student extends Person {

    private int Klass;

    public Student(String name, int age, int Klass) {
        super(name, age);
        this.Klass = Klass;
    }

    public int getKlass() {
        return Klass;
    }

    @Override
    public String introduce() {
        return String.format("I am a Student. I am at Class %d.", this.Klass);
    }
}
