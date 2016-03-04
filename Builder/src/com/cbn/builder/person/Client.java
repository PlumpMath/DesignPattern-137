package com.cbn.builder.person;

public class Client {
	public static void main(String[] args) {
		Director director = new Director();
		Builder builder1 = new FatPersonBuilder();
		director.construct(builder1);
		Product product = builder1.retrieveProduct();
		product.show();
	}
}
