package com.demo.java_stream;

import java.util.ArrayList;
import java.util.List;

public class MaxAndMinProductPrice {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        Product productMax = productsList.stream()
                                         .max((prod1, prod2)-> prod1.price>prod2.price?1:-1)
                                         .get();
        Product productMin = productsList.stream()
                .min((prod1, prod2)-> prod1.price>prod2.price?1:-1)
                .get();
        System.out.println("Costliest product " + productMax.price);
        System.out.println("Cheapest Product " + productMin.price);
    }
}
