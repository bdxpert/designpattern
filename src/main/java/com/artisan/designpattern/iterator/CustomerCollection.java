package com.artisan.designpattern.iterator;

import java.util.*;
import java.util.function.Predicate;

public class CustomerCollection {
	List<Customer> customers = new ArrayList<Customer>();
	
	public void add(Customer customer) {
		customers.add(customer);
	}

	public Iterator<Customer> getIterator()
	{
		Collections.sort(customers, new Comparator<Customer>() {
			@Override
			public int compare(Customer o1, Customer o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		return new AgeIterator<Customer>(customers);
	}

	public Iterator<Customer> getIterator(Predicate<Customer> predicate)
	{
		Collections.sort(customers, new Comparator<Customer>() {
			@Override
			public int compare(Customer o1, Customer o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		return new AgeIterator<Customer>(customers, predicate);
	}
	/*public void print() {
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}*/
	public Iterator<Customer> getIteratorv2()
	{
		return new CustomerIterator<Customer>(customers);
	}
}
