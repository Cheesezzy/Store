package com.pach.services;


import com.pach.models.Customer;
import com.pach.models.Product;

import java.util.List;

public interface CustomerInterface {
    String buy(Customer customer, Product productToBuy, Integer quantity);

    String addProductToCart(Product productToBuy, int quantity);
}
