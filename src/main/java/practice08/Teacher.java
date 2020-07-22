package practice08;

public class Teacher extends Person{

    private Klass klass;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (null == klass) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            return super.introduce() + String.format(" I am a Teacher. I teach %s." , this.klass.getDisplayName());
        }
    }

    public String introduceWith(Student student) {
        if (student.getKlass().equals(this.klass)) {
            // My name is Tom. I am 21 years old.
            return super.introduce() + String.format(" I am a Teacher. I teach %s.", student.getName());
        } else {
            return super.introduce() + String.format(" I am a Teacher. I don't teach %s.", student.getName());
        }
    }
}
