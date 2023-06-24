package com.artisan.designpattern.composit;

public class Product extends ProductCatalog{
    public Product(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("-- Product "+name);
    }
}
