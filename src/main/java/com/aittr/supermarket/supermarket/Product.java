package com.aittr.supermarket.supermarket;

import java.util.Objects;

public class Product implements Comparable<Product>{
    private String name;
    private int code;
    private String unit;
    private double price;
    private double quantity;


    @Override
    public String toString() {
        String str = "Name: " + name
                +" Code: " + code
                + " Price: " + price
                + " Unit: " + unit +
                "\nQuantity: " + quantity;
        return str;
    }

    public Product(String name, int code, String unit, double price) {
        super();
        this.name = name;
        this.code = code;
        this.unit = unit;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Product other) {

        return name.compareToIgnoreCase(other.name);
    }

    @Override
  public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        return this.code == other.code;


//        if (o == null || getClass() != o.getClass()) return false;
//        Product product = (Product) o; // kasting object
//        return code == product.code;
    }




}
