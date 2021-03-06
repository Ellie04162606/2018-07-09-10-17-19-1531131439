package practice04;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String basicIntroduce(String name,int age){
        return "My name is " + name + ". I am " + age + " years old.";
    }
    public String introduce() {
        return basicIntroduce(getName(),getAge());
    }
}
