/*
 * Copyright (c) 2019. Ashot Tonaganyan mitodzzz@gmail.com
 */

package contacts;

import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<Contact> contacts;

    public PhoneBook() {
        contacts = new ArrayList<>();
    }

    public PhoneBook(Contact contact) {
        contacts = new ArrayList<>();
        System.out.println("A record created!\n" +
                "A Phone Book with a single record created!");
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public int getCount() {
        return contacts.size();
    }

    public void editContact(int index, String field, String string) {
        switch (field) {
            case "name":
                contacts.get(index - 1).setName(string);
                break;
            case "surname":
                contacts.get(index - 1).setSurname(string);
                break;
            case "number":
                contacts.get(index - 1).setNumber(string);
                break;
        }
    }

    public void removeContact(int index) {
        contacts.remove(index - 1);
        contacts.trimToSize();
    }

    public boolean isEmpty() {
        return contacts.isEmpty();
    }

    public void showList() {
        int count = 1;
        for (Contact c : contacts) {
            System.out.println(count++ + ". " + c.getName() + " " +
                    c.getSurname() + ", " + (c.hasNumber() ? c.getNumber() : "[no number]"));
        }
    }
}
