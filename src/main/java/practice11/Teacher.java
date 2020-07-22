package practice11;

import java.util.LinkedList;

public class Teacher extends Person {

    private LinkedList<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        for (Klass klass :
                classes) {
            klass.registerTeachers(this);
        }
    }

    @Override
    public String introduce() {
        if (null == classes || classes.size() == 0 ) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < classes.size(); i++) {
                builder.append(classes.get(i).getNumber());
                if (i < classes.size() - 1) {
                    builder.append(", ");
                }
            }
            return super.introduce() + " I am a Teacher. I teach Class " + builder.toString() + ".";
        }
    }

    public boolean isTeaching(Student student) {
        for (Klass klass : classes) {
            if (klass.isIn(student)) {
                return true;
            }
        }
        return false;
    }

    public String introduceWith(Student student) {
        for (Klass klass : classes) {
            if (klass.isIn(student)) {
                return super.introduce() + String.format(" I am a Teacher. I teach %s.", student.getName());
            }
        }
        return super.introduce() + String.format(" I am a Teacher. I don't teach %s.", student.getName());
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public void updateJoinMsg(Student student, Klass klass) {
        System.out.printf("I am %s. I know %s has joined Class %d.\n", getName(), student.getName(), klass.getNumber());
    }

    public void updateAssignMsg(Student student, Klass klass) {
        System.out.printf("I am %s. I know %s become Leader of Class %d.\n", getName(), student.getName(), klass.getNumber());
    }
}
