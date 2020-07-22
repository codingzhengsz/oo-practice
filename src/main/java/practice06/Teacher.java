package practice06;

public class Teacher extends Person {
    private int Klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int Klass) {
        super(name, age);
        this.Klass = Klass;
    }

    public int getKlass() {
        return Klass;
    }

    @Override
    public String introduce() {
        if (Klass == 0) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            return super.introduce() + String.format(" I am a Teacher. I teach Class %d.", getKlass());
        }
    }
}
