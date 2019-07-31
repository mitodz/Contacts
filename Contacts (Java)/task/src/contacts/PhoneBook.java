package contacts;

import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<Contact> contacts;

    public PhoneBook () {
        contacts = new ArrayList<>();
    }

    public PhoneBook (Contact contact) {
        contacts = new ArrayList<>();
        System.out.println("A record created!\n" +
                "A Phone Book with a single record created!");
    }

    public void addContact (Contact contact) {
        contacts.add(contact);
    }

    public int getCount() {
        return contacts.size();
    }

    public void removeContact (int index) {
        contacts.remove(index);
        contacts.trimToSize();
    }
}
