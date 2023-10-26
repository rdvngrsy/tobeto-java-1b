package org.example.packages;

public class User {
    public User(String firstName, String surname, String phoneNumber,String customerId) {
        this.firstName = firstName;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.customerId = customerId;
    }

    String firstName;
    String surname;
    String phoneNumber;
    String customerId;


    public String getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void getUserInfo(){

        String[] showInfo = {getFirstName(),getSurname(),getPhoneNumber(),getCustomerId()};
        for (int i = 0; i < showInfo.length; i++) {
            System.out.println(showInfo[i]);
        }
    }
}
