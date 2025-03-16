package practice_5.test6;

public class Main {
    public static void main(String[] args) {
        Course algebra = new Course("Algebra");
        Student student = new Student("John");
        Teacher teacher = new Teacher("Mrs. Smith");

        EduPlatform eduPlatform = new EduPlatform();
        eduPlatform.createCourse(algebra);

        algebra.addStudent(student);
        algebra.addTeacher(teacher);

        student.study();
        student.recordProgress();
        teacher.checkAssignment(student);

    }
}
