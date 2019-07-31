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
                    break;
                case "list":
                    if (phoneBook.isEmpty()) {
                        System.out.println("No records to show!");
                    } else phoneBook.showList();
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
