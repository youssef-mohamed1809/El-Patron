package com.example.elpatronproject;

import java.util.ArrayList;

public class Product {
    String name;
    double price;
    String productID;
    String imageURL;
    int quantity;

    ArrayList<String> reviews = new ArrayList<String>();

    Product(){}

    @Override
    public String toString(){
        String s = "Product Name: " + name + "\n" + "Product Price: " + price;
        return s;
    }
    Product(String name, double price, String ImageURL, String productID){
        this.name = name;
        this.price = price;
        this.imageURL = ImageURL;
        this.productID = productID;
    }

    public void addReview(String s){
        this.reviews.add(s);
    }



}
