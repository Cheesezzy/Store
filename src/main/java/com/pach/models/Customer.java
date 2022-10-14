package com.pach.models;

import com.pach.enums.Gender;
import com.pach.exceptions.OutOfStockException;
import com.pach.services.CustomerInterface;
import java.util.ArrayList;
import java.util.List;

public class Customer extends Person implements Comparable<Customer>, CustomerInterface {

    private Double accountBal;
    private int totalQuantityInCart;
    private List<Product> cart;
    @Override
    public int compareTo(Customer customer) {
        if (this.totalQuantityInCart < customer.getTotalQuantitySumInCart()) {
            return 1;
        } else if (this.totalQuantityInCart > customer.getTotalQuantitySumInCart()) {
            return -1;
        } else {
            return 0;
        }
    }

    public int getTotalQuantitySumInCart() {
        return totalQuantityInCart;
    }

    public void setTotalQuantitySumInCart(int totalQuantityInCart) {
        this.totalQuantityInCart = totalQuantityInCart;
    }



    public Customer(String firstName, String surName, Long phoneNumber, Gender gender, String email, String address, Double accountBal) {
        super(firstName, surName, phoneNumber, gender, email, address);
        this.accountBal = accountBal;
        this.totalQuantityInCart = 0;
        this.cart = new ArrayList<>();
    }

    public List<Product> getCart() {
        return cart;
    }
    public void setCart(List<Product> cart) {
        this.cart = cart;
    }

    public Cashier getCashier() {
        return cashier;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    public Customer() {
    }

    public Double getAccountBal() {
        return accountBal;
    }

    public void setAccountBal(Double accountBal) {
        this.accountBal = accountBal;
    }

    Cashier cashier = new Cashier();
    @Override
    public String buy(Customer customer, Product productToBuy, Integer quantity) {
        if (quantity < 0){
            try {
                throw new IllegalArgumentException("Quantity cannot be less than Zero");
            }catch (IllegalArgumentException e){
                return e.getMessage();
            }
        }
        else if (productToBuy.getQuantity() == 0){
            System.out.println("Out Of Stock!");
        }
        else if (quantity <= productToBuy.getQuantity()) {
//            return cashier.sell(customer,productToBuy);
        }
            return "Available quantity is: " + productToBuy.getQuantity();


    }
    @Override
    public String addProductToCart(Product productToBuy, int quantity) {
        if (productToBuy.getQuantity() >= quantity){
            this.totalQuantityInCart += quantity;
            cart.add(new Product(productToBuy.getProdID(),
                    productToBuy.getName(), productToBuy.getCategory(), quantity, productToBuy.getPrice()));
        }
        else {
            throw new OutOfStockException("OUT OF STOCK");
        }
        return "Item Added";
    }

    @Override
    public String toString() {
        return "Customer{" +
                "accountBal=" + accountBal +
                ", totalQuantityInCart=" + totalQuantityInCart +
                "}\n " + super.toString();
    }
}




