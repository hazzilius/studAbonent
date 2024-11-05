public class Abonent {
    private int id;
    private String lastName;
    private String name;
    private String surName;
    private String adress;
    private int secondsPassedInCall;
    private String creditCardNumber;
    private int debt;

    public Abonent(int id, String lastName, String name, String surName, String adress, int secondsPassedInCall, String creditCardNumber, int debt) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.surName = surName;
        this.adress = adress;
        this.secondsPassedInCall = secondsPassedInCall;
        this.creditCardNumber = creditCardNumber;
        this.debt = debt;
    }

    public Abonent(String lastName, String name, String surName, String adress) {
        this.lastName = lastName;
        this.name = name;
        this.surName = surName;
        this.adress = adress;
    }
}
