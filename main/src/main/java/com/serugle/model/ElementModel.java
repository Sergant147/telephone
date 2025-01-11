package com.serugle.model;

public class ElementModel {
    private String username;
    private String phoneNumber;

    public ElementModel(String username, String phoneNumber) {
        this.username = username;
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
