package com.aittr.supermarket.supermarket;

import java.util.ArrayList;
import java.util.Iterator;

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

    public void addProduct(Product p, double quantity) {
        if (stock.contains(p) == false) { // überprüft ob wir haben den produckt
            p.setQuantity(quantity);
            stock.add(p);// wen nicht dann dazugeben in der producktliste
            stock.sort(null);
        } else {
            for (Product pr : stock) {  //wenn wir produkt haben dann + zu der producktliste
                if (pr.getCode() == p.getCode()) {
                    double q = pr.getQuantity();
                    q += quantity;
                    pr.setQuantity(q);
                    break;
                }
            }
        }

    }

    public void printProducts() {
        System.out.println("**************");
        System.out.println("Supermarket: " + name);
        System.out.println("Address: " + address);
        System.out.println("\t\t\tStock: ");
        for (Product pr : stock) {
            System.out.println(pr);
        }
        System.out.println("*************");


    }

    public void removeProduct(int code, double quantity) {
        for (Product pr : stock) {
            if (pr.getCode() == code) {
                double q = pr.getQuantity();
                q -= quantity;
                if (q < 0) q = 0;
                pr.setQuantity(q);
                return;
            }
        }
        System.out.println();
        System.out.println("________________");
        System.out.println("Wrong code !!!!! " + code);
        System.out.println("________________");

    }

    public void reducePrice(int code, double percent) {
        for (Product pr : stock) {
            if (pr.getCode() == code) {
                double price = pr.getPrice();
                double discount = (price * percent) / 100;
                price -= discount;
                pr.setPrice(price);
                return;
            }
            System.out.println("________________________");
            System.out.println("Wrong code !!!!! " + code);
            System.out.println("________________________");
        }


    }

    public void sortProductsBy(int criteria) {
        switch (criteria) {
            case ISortingCriteria.SORT_BY_PRICE:
                ComparatorProductsByPrice comp1 = new ComparatorProductsByPrice();
                stock.sort(comp1);
                break;
            case ISortingCriteria.SORT_BY_NAME_REVERSE:
                ComparatorProductsByNameReverse comp2 = new ComparatorProductsByNameReverse();
                stock.sort(comp2);
                break;
            case ISortingCriteria.SORT_BY_CODE_REVERSE:
                ComparatorProductsByCodeReverse comp3 = new ComparatorProductsByCodeReverse();
                stock.sort(comp3);
                break;
        }

    }

    public void findProduct(int code) {
        for (Product pr : stock) {
            if (pr.getCode() == code) {
                System.out.println(pr);
                return;
            }
        }
        System.out.println("------------");
        System.out.println("Find code!!! " + code);
        System.out.println("_____________");
    }

    public void removeProductFromStock(int code) {
        Iterator<Product> iterator = stock.iterator();
        while (iterator.hasNext()) {
            Product pr = iterator.next();
            if (pr.getCode() == code) {
                iterator.remove();
                return;
            }
        }
        System.out.println("Wrong code !!! " + code);

    }
    public void reducePriceForAll(double percent){
        for (Product pr: stock){
            double price = pr.getPrice();
            double discount = (price * percent)/100;
            price -= discount;
            pr.setPrice(price);
        }
        System.out.println("- discount");
    }
}
