package com.cbn.strategy;
/**
 * 抽象策略角色
 * @author boning
 *
 */
public abstract class DisCountStrategy {
	protected double singlePrice;
	protected int copies;
	
	public DisCountStrategy(double singlePrice, int copies){
		this.singlePrice = singlePrice;
		this.copies =  copies;
	}
	/**
	 * 策略方法
	 * @return
	 */
	public abstract double calculateDiscount();
}
