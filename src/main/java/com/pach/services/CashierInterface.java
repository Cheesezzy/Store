package com.pach.services;


import com.pach.models.Customer;
import com.pach.models.Product;

public interface CashierInterface {
    String sell (Customer customer, Product product);
}
