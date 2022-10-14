package com.pach;

import com.pach.csv.CSVReader;
import com.pach.enums.Department;
import com.pach.enums.Gender;
import com.pach.models.*;

import java.util.*;

public class SaveBuy {

    public static void main(String[] args) {
        Store store = new Store();
        store.readFromFile();
        store.setupCustomers();

        //Cashiers profile and methods
        Cashier cashier1 = new Cashier(002, "Richard", "Diamond", 234704653233L, Gender.MALE,
                "Rich@email.com", "20 broad str", Department.SALES, 0.00);
        Cashier cashier2 = new Cashier(003, "justice", "ali", 234704653233L, Gender.MALE,
                "Ali@email.com", "689 gym str", Department.SALES, 0.00);


        //Managers profile and methods
        Manager manager = new Manager(001, "Shalom", "Fortune", 234705763894L, Gender.FEMALE,
                "Shamlo@email.com", "36 groove str", Department.ADMIN, 0.00);
//       System.out.println(manager.paySalary(1000.00));
//       System.out.println(manager.hireCashier(40));


        // List of products read from CSV
        System.out.println("Products In Store: " + store.getProducts());
        List<Product> productList = store.getProducts();
        Product coke = productList.get(0);
        Product pepsi = productList.get(1);
        Product bigi = productList.get(2);
        Product rice = productList.get(3);
        Product beans = productList.get(4);
        Product yam = productList.get(5);
        Product pound = productList.get(6);
        Product sponge = productList.get(7);
        Product biscuit = productList.get(8);

        //composition of customers
        Customer customerAbu = store.getCustomerList().get(0);
        Customer customerJohn = store.getCustomerList().get(1);
        Customer customerRichard = store.getCustomerList().get(2);
        Customer customerBush = store.getCustomerList().get(3);
        Customer customerAngela = store.getCustomerList().get(4);
        Customer customerFemi = store.getCustomerList().get(5);
//        CSVReader readCSV = new CSVReader();
//        readCSV.readCSV();
//        List<Product> products = readCSV.getProductList();



        // customers on the queue to be attended to
        customerAbu.addProductToCart(coke, 2);
        customerJohn.addProductToCart(pepsi,4);
        customerAngela.addProductToCart(rice,3);
        customerJohn.addProductToCart(sponge,5);
        customerFemi.addProductToCart(biscuit,6);
        customerFemi.addProductToCart(biscuit,6);
        customerRichard.addProductToCart(biscuit,4);
        customerBush.addProductToCart(biscuit,3);


        System.out.println("******** Priority Queue Based On Quantity *************");
        PriorityQueueImpl p = new PriorityQueueImpl();
        p.priorityBasedOnQuantity(store);
        System.out.println("\n\n\n");
        System.out.println("******** Priority Queue Based On FIFO *************");
        p.priorityBasedOnFIFO(store);

        System.out.println("********************************");

    }
}