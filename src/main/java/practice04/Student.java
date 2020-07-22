package practice04;

public class Student extends Person {
    private int Klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        Klass = klass;
    }

    public int getKlass() {
        return Klass;
    }

    public String introduce() {
        return basicIntroduce(getName(),getAge())+" I am a Student. I am at Class " + getKlass() + ".";
    }
}
