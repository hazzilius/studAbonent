public class Abonent {
    private int id;
    private String lastName;
    private String name;
    private String surName;
    private String adress;
    private int minutesPassedInCall;
    private String creditCardNumber;
    private int debt;

    public Abonent(int id, String lastName, String name, String surName, String adress, int minutesPassedInCall, String creditCardNumber, int debt) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.surName = surName;
        this.adress = adress;
        this.minutesPassedInCall = minutesPassedInCall;
        this.creditCardNumber = creditCardNumber;
        this.debt = debt;
    }

    public Abonent(String lastName, String name, String surName, String adress) {
        this.lastName = lastName;
        this.name = name;
        this.surName = surName;
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getminutesPassedInCall() {
        return minutesPassedInCall;
    }

    public void setminutesPassedInCall(int minutesPassedInCall) {
        this.minutesPassedInCall = minutesPassedInCall;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getDebt() {
        return debt;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }

    public String toString(){
        return "ID: " + id + " Фамилия: " + lastName + " Имя: " + name + " Отчество: " + surName + " Адрес: " + adress + " Общее кол-во минут: " + minutesPassedInCall + " Номер карты: " + creditCardNumber + " Сумма долга: " + debt;
    }
}
