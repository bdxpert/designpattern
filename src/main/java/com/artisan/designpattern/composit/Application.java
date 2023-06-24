package com.artisan.designpattern.composit;

public class Application {

	public static void main(String[] args) {

		Category mens = new Category("Mens");
		Category teenage = new Category("teenage");

		Category women = new Category("Women");
		Category girls = new Category("girls");

		Product sharee = new Product("Sharee");
		Product salower = new Product("Salower");
		System.out.println("....Women Category....");
		women.addCatalog(girls);
		women.addCatalog(sharee);
		women.addCatalog(salower);
		women.print();

		Product shoe = new Product("shoe");
		Product shirt = new Product("Shirt");
		Product belt = new Product("Belt");

		System.out.println("....Mens Category....");
		mens.addCatalog(teenage);
		mens.addCatalog(shoe);
		mens.addCatalog(belt);
		mens.addCatalog(shirt);
		mens.print();
	  }

}
