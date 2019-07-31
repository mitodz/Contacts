package contacts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("+0 (123) 456-789-ABcd"); //456-789-ABcd
        Contact first = new Contact();
//        System.out.println("Enter the name of the person:\n" +
//                "> ");
//        first.setName(scanner.next());
//        System.out.println("Enter the surname of the person:\n" +
//                "> ");
//        first.setName(scanner.next());
        System.out.print("Enter the number:\n" +
                "> ");
        String number = scanner.nextLine();
        first.setName(number);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact(first);
    }
}
