package com.pach.models;


import com.pach.enums.Gender;

public class Applicants extends Person {
    private Integer grade;

    public Applicants(String firstName, String surName, Long phoneNumber, Gender gender, String email, String address, Integer grade) {
        super(firstName, surName, phoneNumber, gender, email, address);
        this.grade = grade;
    }

    public Applicants() {
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Applicants{" +
                "grade=" + grade +
                "} " + super.toString();
    }
}
