package practice_5.test6;

public class Course {
    private String course;

    public Course(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void addStudent(Student student) {
        System.out.println(student.getName() + " is added to course: " + getCourse());
    }

    public void addTeacher(Teacher teacher) {
        System.out.println(teacher.getName() + " is added to course: " + getCourse());
    }

}
