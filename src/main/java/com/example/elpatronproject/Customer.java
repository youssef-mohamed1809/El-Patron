package com.example.elpatronproject;

import java.util.ArrayList;

public class Customer extends User{
    String role = "customer";
    int orderNum = 0;
    ArrayList<Product> myCart = new ArrayList<Product>();

    Order orders = new Order();




    Customer (String username, String password){
        this.username = username;
        this.password = password;

    }


}
