package contacts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        while (true) {
            System.out.print("Enter action (add, remove, edit, count, list, exit): > ");
            Contact contact = new Contact(scanner);
        }

    }
}
