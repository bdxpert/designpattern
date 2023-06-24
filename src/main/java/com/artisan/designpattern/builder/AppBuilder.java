package com.artisan.designpattern.builder;

public class AppBuilder {
    public static void main(String[] args) {
        Customer customer1 = new Customer.Builder()
                .withFirstName("Lukas")
                .withLastname("Batteries")
                .withEmail("lukasBatteries@gmail.com")
                .withAge(31)
                .isMarried()
                .withNumberOfChildren(4)
                .withPhone("0023416754")
                .withShoesize(8)
                .withYearlyIncome(50000.0)
                .withYearlyAmountSpendOnShoes(2000.0)
                .build();
        System.out.println(customer1);
        Customer customer2 = new Customer.Builder()
                .withFirstName("Lukas")
                .withLastname("Batteries")
                .isNotMarried()
                .withPhone("0098345234")
                .build();
        System.out.println(customer2);
    }
}
