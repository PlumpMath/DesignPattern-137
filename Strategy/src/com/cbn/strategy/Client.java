package com.cbn.strategy;
/**
 * 策略模式
 * 其用意是针对一组算法，将每个算法封装到具有共同接口的独立的类中，从而使得他们可以互相替换
 * 
 * 例子，设计一个贩卖各类书籍的电子商务网站的购物车系统。具有复杂的折扣算法。
 * 使用策略模式。把行为和环境分割开来，环境类负责维持和查询行为类，各种算法则在具体策略类中提供。
 * 
 * 折扣简单算法：
 * 1.对有些图书没有折扣。折扣算法返回0作为折扣值
 * 2.对有些图书提供一个固定量为1元的折扣
 * 3.对有些图书提供一个百分比的折扣
 * @author boning
 *
 */
public class Client {
	private static double singlePrice = 3.00;
	private static int copies = 4;
	public static void main(String[] args) {
		Discounter discounter = new Discounter(new FlatRateStrategy(singlePrice, copies,1));
		System.out.println("固定量的折扣 "+discounter.calculateDiscount());
		discounter.setStrategy(new NoDiscountStrategy(singlePrice, copies));
		System.out.println("没有折扣的" + discounter.calculateDiscount());
		discounter.setStrategy(new PercentageStrategy(singlePrice, copies, 0.1));
		System.out.println("百分比的折扣 "+discounter.calculateDiscount());
	}
}
