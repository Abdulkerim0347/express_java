package practice_2;

public class Teacher {
    String name;
    String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    String getName() {
        return name;
    }

    String getSubject() {
        return subject;
    }

    void setName(String name) {
        this.name = name;
    }

    void setSubject(String subject) {
        this.subject = subject;
    }

    void printInfo() {
        System.out.println("Name: " + name + ", subject: " + subject);
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Alex Pshe", "QA");
        teacher.setSubject("AQA");
        teacher.printInfo();
    }
}
