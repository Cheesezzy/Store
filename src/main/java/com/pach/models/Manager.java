package com.pach.models;


import com.pach.enums.Department;
import com.pach.enums.Gender;
import com.pach.services.ManagerInterface;

public class Manager extends Staff implements ManagerInterface {

    //Inheritance is applied here


    public Manager(int staffID, String firstName, String surName, Long phoneNumber, Gender gender, String email, String address, Department department, Double totalIncome) {
        super(staffID,firstName, surName, phoneNumber, gender, email, address, department, totalIncome);
    }

    public Manager() {
    }
    Customer customer = new Customer();
    //managers method implemented from managerInterface
    public String paySalary(Double salary) {
        Cashier cashier = new Cashier();
        double grossSalary = salary;
        double incomeTax = 10.00;
        double netSalary = grossSalary - (incomeTax);
        cashier.setTotalIncome(netSalary);
        return ( "Salary PAID" );
    }
    Applicants applicants = new Applicants("John","Doe",234098726152L, Gender.MALE,"johndoe@email.com",
            "forlan jester str",50);

    public  String hireCashier(Applicants applicants) {
        int cutOffMark = 50;
        if ( applicants.getGrade() >= cutOffMark){
            return "You are HIRED!";
        }
        else
            return "We will get Back to You!";
    }

    @Override
    public String toString() {
        return "Manager{" +
                "customer=" + customer +
                ", applicants=" + applicants +
                "} " + super.toString();
    }
}
