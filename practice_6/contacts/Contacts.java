package practice_6.contacts;

import java.util.HashMap;

public class Contacts {
    private HashMap<String, String> contacts;

    public Contacts() {
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, String number) {
        contacts.put(name, number);
    }

    public String searchContact(String name) {
        return contacts.get(name);
    }

    public void updateContact(String name, String newNumber) {
        contacts.put(name, newNumber);
    }

    public void printAll() {
        System.out.println("Contacts:");
        contacts.forEach(
                (name,number) -> {
                    System.out.printf("%s: %s", name, number);
                    System.out.println();
                    }
                );
    }


}
