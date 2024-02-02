package org.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

public class Client {

    String name;
    String surname;
    LocalDate dateOfBirth;
    String pesel;

    String password;
    String  accountNumber;

    public Client(String name, String surname, LocalDate dateOfBirth, String pesel, String accountNumber,String password) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.pesel = pesel;
        this.accountNumber = accountNumber;
        this.password = password;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = LocalDate.parse(dateOfBirth);
    }

    public String getPESEL() {
        return pesel;
    }

    public void setPESEL(String PESEL) {
        this.pesel = PESEL;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Month getMonthOfbirth() {
        return getMonth();
    }

    private Month getMonth() {
        return dateOfBirth.getMonth();
    }

    public int getMonthNumber() {

        Map<String, Integer> monthsMap = new HashMap<>();
        monthsMap.put("JANUARY", 2);
        monthsMap.put("FEBRUARY", 3);
        monthsMap.put("MARCH", 4);
        monthsMap.put("APRIL", 5);
        monthsMap.put("MAY", 6);
        monthsMap.put("JUNE", 7);
        monthsMap.put("JULY", 8);
        monthsMap.put("AUGUST", 9);
        monthsMap.put("SEPTEMBER", 10);
        monthsMap.put("OCTOBER", 11);
        monthsMap.put("NOVEMBER", 12);
        monthsMap.put("DECEMBER", 13);
        String monthOfBirthUpperCase = (this.getMonthOfbirth()).toString().toUpperCase();
       return monthsMap.get(monthOfBirthUpperCase);
    }

    public String getDay() {
        return dateOfBirth.getDayOfWeek().toString();
    }

    public String getYear() {
        return String.valueOf(dateOfBirth.getYear());
    }

}
