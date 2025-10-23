package com.design.patterns.acreational.cbuilder;

public class Customer {
	//required
	private int id;
	private String name;
	
	//optional
	private String address;
	private String email;
	private String phone;
	
	
	private Customer(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.address = builder.address;
		this.email = builder.email;
		this.phone = builder.phone;
	}
	
	public static class Builder {
		//required
		private int id;
		private String name;
		
		//optional
		private String address;
		private String email;
		private String phone;
		
		public Builder(int id, String name) {
			this.id = id;
			this.name = name;
		}
		
		public Builder addAddress(String address) {
			this.address = address;
			return this;
		}
		
		public Builder addEmail(String email) {
			this.email = email;
			return this;
		}
		
		public Builder addPhone(String phone) {
			this.phone = phone;
			return this;
		}
		
		public Customer build() {
			return new Customer(this);
		}
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", phone="
				+ phone + "]";
	}
	
	
}
