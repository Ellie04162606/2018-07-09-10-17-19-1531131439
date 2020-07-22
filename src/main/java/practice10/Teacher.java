package practice10;


import java.util.LinkedList;

public class Teacher extends Person {
    private Klass klass;
    LinkedList<practice10.Klass> classes;

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if (classes == null) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        StringBuilder classNums = new StringBuilder(String.valueOf(classes.get(0).getNumber()));
        if (classes.size() > 1) {
            for (int i = 1; i < classes.size(); i++) {
                classNums.append(String.format(", %d", classes.get(i).getNumber()));
            }
        }
        return super.introduce() + String.format(" I am a Teacher. I teach Class %s.", classNums.toString());
    }

    public String introduceWith(Student student) {
        if (isTeaching(student)) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        } else {
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public boolean isTeaching(Student student) {
        boolean isIn = false;
        for (Klass klass : classes) {
            if (student.getKlass() != null && klass.getNumber() == student.getKlass().getNumber()) {
                isIn = true;
                break;
            }
        }
        return isIn;
    }
}
