package practice_3;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    Person(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    String getSsn() {
        return ssn;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void printPersonInfo() {
        System.out.println("Name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("SSN: " + ssn);
    }


    public static void main(String[] args) {
        Person obj1 = new Person("James","Smith","1234");
        Person obj2 = new Person("Dan","Wick", "1233");
        Person obj3 = new Person("Jon","Jones", "1111");

        obj1.setFirstName("George");
        obj2.setLastName("Benavidez");

        obj1.printPersonInfo();
        obj2.printPersonInfo();
        obj3.printPersonInfo();


    }


}
