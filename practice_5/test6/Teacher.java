package practice_5.test6;

public class Teacher extends Person {
    public Teacher(String name) {
        super(name);
    }

    public void checkAssignment(Student student) {
        System.out.println(getName() + " checks the assignment of " + student.getName());
    }
}
