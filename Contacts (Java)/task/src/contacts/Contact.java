/*
 * Copyright (c) 2019. Ashot Tonaganyan mitodzzz@gmail.com
 */

package contacts;

import java.util.Scanner;

public class Contact {
    private String name;
    private String surname;
    private String number = "";

    public Contact() {
    }

    ;

    public Contact(Scanner scanner) {
        System.out.print("Enter the name: > ");
        name = scanner.nextLine();
        System.out.print("Enter the surname: > ");
        surname = scanner.nextLine();
        System.out.print("Enter the number: > ");
        String buf = scanner.nextLine();
        if (!isCorrect(buf)) {
            System.out.println("Wrong number format!");
        } else number = buf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumber() {
        return number;
    }

    public boolean isCorrect(String number) {
        return number.matches("((\\+?\\(?\\w+\\)?(([\\s|\\-]\\w{2,})+)?)|" +
                "(\\+?\\w+[\\s|\\-]?\\(?\\w{2,}\\)?(([\\s|\\-]\\w{2,})+)?))") && number.length() > 1;

    }

    public void setNumber(String number) {
        if (isCorrect(number)) {
            this.number = number;
        } else {
            this.number = "[no number]";
            System.out.println("Wrong number format!");
        }
    }

    public boolean hasNumber() {
        return !number.isEmpty();
    }
}
