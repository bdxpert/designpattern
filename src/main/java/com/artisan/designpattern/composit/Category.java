package com.artisan.designpattern.composit;

import java.util.ArrayList;
import java.util.Collection;

public class Category extends ProductCatalog {
    protected Collection<ProductCatalog> catalogCollections = new ArrayList<ProductCatalog>();

    public Category(String name) {
        super(name);
    }

    public void addCatalog(ProductCatalog productCatalog) {
        catalogCollections.add(productCatalog);
    }

    @Override
    public void print() {
        System.out.println("-- Category " + name);
        for (ProductCatalog catalog : catalogCollections) {
            catalog.print();
        }
    }
}
