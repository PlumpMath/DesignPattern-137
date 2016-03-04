package com.cbn.builder.person;

public class Director {
	public void construct(Builder builder){
		builder.builderHead();
		builder.builderBody();
		builder.builderHands();
		builder.builderFoots();
	}
}
