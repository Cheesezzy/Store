package com.pach.models;

import com.pach.enums.Department;
import com.pach.enums.Gender;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManagerTest {

    Cashier cashier1 = new Cashier(002, "Richard", "Diamond", 234704653233L, Gender.MALE,"Rich@email.com","20 broad str", Department.SALES,0.00);
    Cashier cashier2 = new Cashier(003, "justice", "ali", 234704653233L, Gender.MALE,"Ali@email.com","689 gym str", Department.SALES,0.00);
    Manager manager = new Manager();

    Applicants applicants = new Applicants("John","Doe",234098726152L,Gender.MALE,"johndoe@email.com","forlan jester str",50);
    @Test
    public void paySalary() {
        String payCashier = manager.paySalary(100.00);

        assertEquals("Salary PAID", payCashier);
    }

    @Test
    public void hireCashier(){
        String result = manager.hireCashier(applicants);
        assertEquals("You are HIRED!",result);
//        Assert.assertNotEquals("We will get Back to You.",result);
    }








}