package practice_6.contacts;

public class Main {
    public static void main(String[] args) {
        Contacts contacts = new Contacts();

        contacts.addContact("Kerim", "+905338759754");
        contacts.addContact("Mom", "+905338759754");
        contacts.addContact("Dad", "+905338759754");


        contacts.updateContact("Mom", "+99365622279");
        contacts.updateContact("Dad", "+99365699571");
        System.out.println(contacts.searchContact("Mom"));
        contacts.printAll();
    }
}
