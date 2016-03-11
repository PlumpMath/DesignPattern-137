package com.cbn.strategy;

public class NoDiscountStrategy extends DisCountStrategy{

	public NoDiscountStrategy(double singlePrice, int copies) {
		super(singlePrice, copies);
	}

	@Override
	public double calculateDiscount() {
		
		return 0;
	}

}
