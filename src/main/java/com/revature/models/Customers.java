package com.revature.models;

public class Customers {
    // Customer Information
    //Id (Primary Key)
    //First Name
    //Last Name
    //Purchase Amount



    private String firstName;
    private String lastName;
    private int customerId;
    private double purchaseAmount;

    //Constructor

    public Customers() {
        // this is required for Jackson Databind ( library that converts java objects and JSON
    }

    public Customers(String firstName, String lastName, double purchaseAmount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.purchaseAmount = purchaseAmount;
    }

    public Customers(int customerId, double purchaseAmount, String lastName, String firstName) {
        this.customerId = customerId;
        this.purchaseAmount = purchaseAmount;
        this.lastName = lastName;
        this.firstName = firstName;
    }
    //Getters and Setters (Mutators)

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }
}
