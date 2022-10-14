package com.pach.models;


import com.pach.enums.Department;
import com.pach.enums.Gender;
import com.pach.services.CashierInterface;

public class Cashier extends Staff implements CashierInterface {

    public Cashier(int staffID, String firstName, String surName, Long phoneNumber, Gender gender, String email, String address, Department department, Double totalIncome) {
        super(staffID,firstName, surName, phoneNumber, gender, email, address, department, totalIncome);
    }

    public Cashier() {
    }

    public String sell(Customer customer, Product productToBuy) {
        String receipt = "Thank you for Shopping with US!";
        if (customer.getAccountBal() > productToBuy.getPrice()){
            return receipt;
        }

        else
            return ("insufficient Balance");
    }
}
