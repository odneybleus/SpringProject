package com.revature.models;

import jakarta.persistence.*;

@Entity // (Marks this class as one that needs to be tracked by Spring Data JPA)
@Table(name = "customers") //@Table is used to provide config info for your table like name, schema, etc
public class Customers {
    // Customer Information
    //ID (Primary Key)
    //First Name
    //Last Name
    //Purchase Amount

    @Id // (Marks this field as the primary key) (Unique and not NULL)
    @GeneratedValue(strategy = GenerationType.IDENTITY)// Generate a value automatically based on Strategy
    private int customerId;
    @Column(name = "first_name") //Provides config at the column level
    private String firstName;
    private String lastName;
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
