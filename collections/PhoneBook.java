package collections;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, Integer> phone;

    public PhoneBook() {
        phone = new HashMap<>();
    }

    public void addContact(String name, Integer number) {
        phone.put(name, number);
    }

    public Integer findNumber(String name) {
        return phone.get(name);
    }

    public void displayContacts() {
        for (Map.Entry<String,Integer> entry : phone.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        PhoneBook phone = new PhoneBook();

        phone.addContact("John", 1234);
        phone.addContact("Alice", 1024);
        phone.addContact("Rick", 1047);

//        System.out.println(phone.findNumber("Alice"));

        phone.displayContacts();


    }
}
