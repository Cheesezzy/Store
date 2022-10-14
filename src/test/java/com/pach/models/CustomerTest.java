package com.pach.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class CustomerTest {
    Store store;

    List<Product> productList;

    @BeforeEach
    void setUp() {
        store = new Store();
        store.readFromFile();
        store.setupCustomers();
        productList = store.getProducts();
    }
    @Test
    void buy(){
        Product coke = productList.get(0);
        Product pepsi = productList.get(1);
        Product bigi = productList.get(2);
        Product rice = productList.get(3);
        Product beans = productList.get(4);
        Product yam = productList.get(5);
        Product pound = productList.get(6);
        Product sponge = productList.get(7);
        Product biscuit = productList.get(8);

        Customer customer1 = store.getCustomerList().get(0);
        Customer customer2 = store.getCustomerList().get(1);
        Customer customer3 = store.getCustomerList().get(2);
        Customer customer4 = store.getCustomerList().get(3);
        Customer customer5 = store.getCustomerList().get(4);
        Customer customer6 = store.getCustomerList().get(5);

        String res = customer1.buy(customer1,coke,4);
       String result = "Out Of Stock!";
       String receipt = "Thank you for Shopping with US!";
        assertEquals(receipt, res);
//       assertNotEquals(receipt, res);

    }

    @Test
    void addProductToCart(){
        Product coke = productList.get(0);
        Product pepsi = productList.get(1);
        Product bigi = productList.get(2);
        Product rice = productList.get(3);
        Product beans = productList.get(4);
        Product yam = productList.get(5);
        Product pound = productList.get(6);
        Product sponge = productList.get(7);
        Product biscuit = productList.get(8);

        Customer customer1 = store.getCustomerList().get(0);
        Customer customer2 = store.getCustomerList().get(1);
        Customer customer3 = store.getCustomerList().get(2);
        Customer customer4 = store.getCustomerList().get(3);
        Customer customer5 = store.getCustomerList().get(4);
        Customer customer6 = store.getCustomerList().get(5);

        String res = customer4.addProductToCart(sponge,5);
        String result = "Item Added";
        assertEquals(result,res);
    }
}
