package com.design.patterns.acreational.cbuilder;

public class BuilderMailClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1 = new Customer
								.Builder(1, "Customer-01").build();
		
		Customer customer2 = new Customer
								.Builder(2, "Customer-02")
								.addEmail("customer-02@gmail.com")
								.build();
		
		Customer customer3 = new Customer
				.Builder(3, "Customer-03")
				.addEmail("customer-03@gmail.com")
				.addPhone("+91 123456789")
				.build();
		
		Customer customer4 = new Customer
				.Builder(4, "Customer-04")
				.addEmail("customer-04@gmail.com")
				.addPhone("+91 123456789")
				.addAddress("#123, 1st street, Bangalore")
				.build();
		
		System.out.println(customer1);
		System.out.println(customer2);
		System.out.println(customer3);
		System.out.println(customer4);

	}

}
