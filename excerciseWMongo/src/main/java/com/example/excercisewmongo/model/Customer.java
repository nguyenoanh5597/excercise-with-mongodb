package com.example.excercisewmongo.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "customers")
public class Customer {
    public String username;
    public String name;
    public String address;
    public Object birthdate;
    public String email;
    public List<Number> accounts;
    public Object tier_and_details;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Object getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Object birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Number> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Number> accounts) {
        this.accounts = accounts;
    }

    public Object getTier_and_details() {
        return tier_and_details;
    }

    public void setTier_and_details(Object tier_and_details) {
        this.tier_and_details = tier_and_details;
    }
}
