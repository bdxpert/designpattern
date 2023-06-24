package com.artisan.designpattern.proxy.dynamic.bank.service.adapter;

import com.artisan.designpattern.proxy.dynamic.bank.domain.Customer;
import com.artisan.designpattern.proxy.dynamic.bank.service.dto.CustomerDTO;

public class CustomerAdapter {
	public static CustomerDTO getCustomerDto(Customer customer) {
		CustomerDTO customerDTO = new CustomerDTO(customer.getName());
		return customerDTO;
	}
}
