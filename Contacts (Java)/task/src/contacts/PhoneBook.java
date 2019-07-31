package contacts;

import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, Contact> contacts;

    public PhoneBook () {
        contacts = new HashMap<>();
    }

    public PhoneBook (Contact contact) {
        contacts = new HashMap<>();
        System.out.println("A record created!\n" +
                "A Phone Book with a single record created!");
    }

    public void addContact (Contact contact) {
        contacts.put(contact.getName(), contact);
    }
}
