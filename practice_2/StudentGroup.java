package practice_2;

public class StudentGroup {
    String groupName;
    int studentCount;

    public StudentGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    int getStudentCount() {
        return studentCount;
    }

    String getGroupName() {
        return groupName;
    }

    void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    void printInfo() {
        System.out.println("Group: " + groupName + ", number of students: " + studentCount);
    }

    public static void main(String[] args) {
        StudentGroup group = new StudentGroup("QA", 35);
        group.printInfo();
        group.setStudentCount(40);
        group.printInfo();
    }
}
