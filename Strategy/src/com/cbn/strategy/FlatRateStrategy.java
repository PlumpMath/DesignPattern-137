package com.cbn.strategy;

public class FlatRateStrategy extends DisCountStrategy{
	private double amount;
	public FlatRateStrategy(double singlePrice, int copies,double amount) {
		super(singlePrice, copies);
		this.amount = amount;
	}

	@Override
	public double calculateDiscount() {
		return copies * amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
