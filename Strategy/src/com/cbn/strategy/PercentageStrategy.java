package com.cbn.strategy;

public class PercentageStrategy extends DisCountStrategy{
	private double percent;
	public PercentageStrategy(double singlePrice, int copies, double percent) {
		super(singlePrice, copies);
		this.percent = percent;
	}

	@Override
	public double calculateDiscount() {
		return percent * singlePrice * copies;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

}
