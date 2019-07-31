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
        System.out.println("The record added.");
    }

    public int getCount() {
        return contacts.size();
    }

    public void removeContact (int index) {
        contacts.remove(index);
        contacts.trimToSize();
    }

    public boolean isEmpty () {
        return contacts.isEmpty();
    }

    public void showList () {
        int count = 1;
        for (Contact c : contacts) {
            System.out.println(count++ + ". " + c.getName() + " " +
                    c.getSurname() + ", " + (c.hasNumber() ? c.getNumber() : "[no number]"));
        }
    }
}
