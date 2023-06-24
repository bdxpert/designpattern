package com.artisan.designpattern.composit;

abstract class ProductCatalog {
    protected String name;
    public ProductCatalog(String name) {
        this.name = name;
    }
    public abstract void print();
}
