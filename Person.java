package com.company;

public class Person {
    public String name;
    public String surname;
    public String nickname;
    public String phoneNumber;
    public String yearOfBirth;
    public String email;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public String getEmail() {
        return email;
    }


    public Person(String name, String surname, String nickname, String phoneNumber, String email, String yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.nickname = nickname;
        this.phoneNumber = phoneNumber;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }

    public String toString() {
        return "\n\nName: " + this.getName()
                + "\nSurname: " + this.getSurname()
                + "\nNickname: " + this.getNickname()
                + "\nPhone Number: " + this.getPhoneNumber()
                + "\nEmail address: " + this.getEmail()
                + "\nYear of birth: " + this.getYearOfBirth();
    }


}
