package com.pach.models;

import com.pach.csv.CSVReader;
import com.pach.enums.Gender;
import java.util.ArrayList;
import java.util.List;

public class Store {
    public static List<Customer> customersQueToBuy = new ArrayList<>();
    CSVReader csvReader;
    private List<Customer> customerList;
    List<Product> products;

    public Store() {
        this.products = new ArrayList<>();
        this.csvReader = new CSVReader();
        this.customerList = new ArrayList<>();
    }

    public static List<Customer> getCustomersQueToBuy() {
        return customersQueToBuy;
    }

    public static void setCustomersQueToBuy(List<Customer> customersQueToBuy) {
        Store.customersQueToBuy = customersQueToBuy;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void readFromFile() {
        this.products = csvReader.readCSVFile();
    }

    public void setupCustomers(){
                ArrayList<Customer> customers = new ArrayList<>();
        customers.add( new Customer("Abu", "George", 234857653421L, Gender.MALE, "joe@email.com",
                "408 framing str", 8000.00));
        customers.add( new Customer("John", "Doe", 234857653421L, Gender.MALE, "joe@email.com",
                "408 framing str", 6000.00));
        customers.add( new Customer("Richard", "Bills", 234857653421L, Gender.MALE, "joe@email.com",
                "408 framing str", 3000.00));
        customers.add( new Customer("Bush", "Daniel", 234857653421L, Gender.MALE, "joe@email.com",
                "408 framing str", 4000.00));
        customers.add( new Customer("Angela", "Vue", 234857653421L, Gender.FEMALE, "joe@email.com",
                "408 framing str", 9000.00));
        customers.add( new Customer("Femi", "Gray", 234857653421L, Gender.MALE, "joe@email.com",
                "408 framing str", 2000.00));

        this.customerList.addAll(customers);
    }
}
