/*
 * Copyright (c) 2019. Ashot Tonaganyan mitodzzz@gmail.com
 */

package contacts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        outer:
        while (true) {
            System.out.print("Enter action (add, remove, edit, count, list, exit): > ");
            String buf = scanner.nextLine();
            switch (buf) {
                case "add":
                    phoneBook.addContact(new Contact(scanner));
                    System.out.println("The record added.");
                    break;
                case "list":
                    if (phoneBook.isEmpty()) {
                        System.out.println("No records to show!");
                    } else phoneBook.showList();
                    break;
                case "remove":
                    if (phoneBook.isEmpty()) {
                        System.out.println("No records to remove!");
                    } else {
                        phoneBook.showList();
                        System.out.print("Select a record: > ");
                        phoneBook.removeContact(Integer.parseInt(scanner.nextLine()));
                        System.out.println("The record removed!");
                    }
                    break;
                case "edit":
                    if (phoneBook.isEmpty()) {
                        System.out.println("No records to edit!");
                    } else {
                        phoneBook.showList();
                        System.out.print("Select a record: > ");
                        int index = Integer.parseInt(scanner.nextLine());
                        System.out.print("Select a field (name, surname, number): > ");
                        String field = scanner.nextLine();
                        System.out.print("Enter " + field + ": > ");
                        String string = scanner.nextLine();
                        phoneBook.editContact(index, field, string);
                        System.out.println("The record updated!");
                    }
                    break;
                case "exit":
                    break outer;
                case "count":
                    System.out.printf("The Phone Book has %s records.\n", phoneBook.getCount());
                    break;
                default:
                    System.out.println("Command not found");
                    break;
            }
        }
    }
}
