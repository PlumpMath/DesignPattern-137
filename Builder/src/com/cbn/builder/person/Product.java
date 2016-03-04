package com.cbn.builder.person;

import java.util.ArrayList;

public class Product {
	protected ArrayList<String> parts = new ArrayList<>(4);
	public void addParts(String part){
		parts.add(part);
	}
	public void show() {
		for(String s: parts){
			System.out.println(s);
		}
	}
}
