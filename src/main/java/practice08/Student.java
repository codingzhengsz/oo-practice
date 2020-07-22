package practice08;

public class Student extends Person {

    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (null != klass.getLeader() && klass.getLeader().getId() == getId()) {
            return super.introduce() + String.format(" I am a Student. I am Leader of %s.", getKlass().getDisplayName());
        } else {
            return super.introduce() + String.format(" I am a Student. I am at %s.", getKlass().getDisplayName());
        }
    }
}
