package com.pach.models;

import com.pach.enums.Department;
import com.pach.enums.Gender;

public abstract class Staff extends Person {

    private int staffID;
    private Department department;
    private Double totalIncome;


    //Constructors


    public Staff(int staffID, String firstName, String surName, Long phoneNumber, Gender gender, String email, String address, Department department, Double totalIncome) {
        super(firstName, surName, phoneNumber, gender, email, address);
        this.staffID = staffID;
        this.department = department;
        this.totalIncome = totalIncome;
    }

    public Staff() {
    }

    public Double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(Double totalIncome) {
        this.totalIncome = totalIncome;
    }

    //Getters and Setters
    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int id) {
        this.staffID = staffID;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


    @Override
    public String toString() {
        return "Staff{" +
                "staffID=" + staffID +
                ", department=" + department +
                ", totalIncome=" + totalIncome +
                "} " + super.toString();
    }
}
