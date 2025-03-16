package practice_5.test6;

public class Student extends Person {
    public Student(String name) {
        super(name);
    }

    public void study() {
        System.out.println(getName() + " studies");
    }

    public void recordProgress() {
        System.out.println(getName() + " records the progress");
    }


}
