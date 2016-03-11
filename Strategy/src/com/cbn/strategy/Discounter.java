package com.cbn.strategy;
/**
 * 环境角色，含有抽象策略角色的一个引用
 * @author boning
 *
 */
public class Discounter {
	private DisCountStrategy strategy;
	
	public Discounter(DisCountStrategy strategy) {
		this.strategy = strategy;
	}
	
	
	public DisCountStrategy getStrategy() {
		return strategy;
	}



	public void setStrategy(DisCountStrategy strategy) {
		this.strategy = strategy;
	}



	public double calculateDiscount(){
		return strategy.calculateDiscount();
	}
}
