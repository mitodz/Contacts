package contacts;

public class Contact {
    private String name;
    private String surname;
    private String number = "";

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

    private boolean isCorrect(String number) {
        return number.matches("(\\+?\\w{1,2}[\\s|\\-]?\\(?\\w{2,14}\\)?)" +
                "(([\\s|\\-]\\w{2,14}){3})?");
    }

    public void setNumber(String number) {
        if (isCorrect(number)) {
            this.number = number;
        }
    }

    public boolean hasNumber () {
        return !number.isEmpty();
    }
}
