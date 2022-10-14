package com.pach.models;


import com.pach.enums.Category;

public class Product {

    private String prodID;

    private String name;

    private Category category;
    private Integer quantity;
    private Double price;


    public Product(String prodID, String name,Category category,Integer quantity,Double price){
        this.prodID = prodID;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
    }

    public Product(){
    }

    public String getProdID() {
        return prodID;
    }

    public void setProdID(String prodID) {
        this.prodID = prodID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{prodID= " + prodID +
                ", name=" + name +
                ", category=" + category +
                ", quantity=" + quantity +
                ", price=" + price +
                "}\n";
    }
}


