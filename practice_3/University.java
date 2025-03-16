package practice_3;

public class University {
    static String universityName = "Harvard";
    final int studentID;
    String studentName;

    public University(String studentName, int studentID) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    static void changeUniversityName(String newName) {
        universityName = newName;
    }

    String getStudentName() {
        return studentName;
    }


    void printInfo() {
        System.out.println("Uni: " + universityName + ", student: " + studentName + ", id: " + studentID);
    }


    public static void main(String[] args) {
        University student1 = new University("John", 1);
        University student2 = new University("Alice", 2);
        University student3 = new University("Eric", 3);
        student1.printInfo();

        University.changeUniversityName("Oxford");
        student1.printInfo();
        student2.printInfo();
        student3.printInfo();


    }
}
