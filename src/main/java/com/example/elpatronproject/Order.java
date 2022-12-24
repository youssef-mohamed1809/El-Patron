package com.example.elpatronproject;

import java.util.ArrayList;

public class Order {
    ArrayList<Product> p = new ArrayList<Product>();
    boolean delivered;

    String full_name;
    String credit_card_num;
    String credit_card_pin;
    String zip;
    String address;

    Order(){}
    Order(ArrayList<Product> p, boolean delivered){
        this.p = p;
        this.delivered = delivered;
    }

    @Override
    public String toString(){
        String s = "";
        for(int i = 0; i < p.size(); i++){
            s+= p.get(i).toString();
            s+='\n';
        }
        if(delivered){
            s+="\n Delivered";
        }else{
            s+="Not Delivered";
        }

        return s;
    }

}
