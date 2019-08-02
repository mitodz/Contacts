/*
 * Copyright (c) 2019. Ashot Tonaganyan mitodzzz@gmail.com
 */

package contacts;

import java.util.Date;

public class Contact {
    private String name;
    private String number = "";


    public Contact() {
    }

    public Contact(String number) {
        if (!isCorrect(number)) {
            this.number = "[no number]";
            System.out.println("Wrong number format!");
        } else this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    private boolean isCorrect(String number) {
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
