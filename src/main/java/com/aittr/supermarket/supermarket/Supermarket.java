package com.aittr.supermarket.supermarket;

import java.util.ArrayList;

public class Supermarket {
    public String name;
    private String address;
    private ArrayList<Product> stock =
            new ArrayList<>();

    public Supermarket(String name, String address) {
        super();
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void addProduct(Product p, double quantity){

    }


}
