package com.demo.java_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamFilter {

    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        System.out.println(productsList);

        List<Float> filteredProductPriceList = productsList.stream()
                                                           .filter(product -> product.price>25000)
                                                           .map(product -> product.price)
                                                           .toList();
        System.out.println(filteredProductPriceList);
    }
}
