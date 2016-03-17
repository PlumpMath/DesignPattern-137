package com.cbn.visitor.example;

abstract public class Equipment {
	abstract public double price();
	abstract public void accept(Visitor vis);
}
