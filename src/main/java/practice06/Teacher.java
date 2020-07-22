package practice06;

import java.util.Optional;

public class Teacher extends Person {
    private int Klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        Klass = klass;
    }

    public int getKlass() {
        return Klass;
    }


    public String introduce() {
        Integer classI = getKlass();
        if (classI.equals(0)) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            return super.introduce() + " I am a Teacher. I teach Class " + getKlass() + ".";
        }
    }
}
