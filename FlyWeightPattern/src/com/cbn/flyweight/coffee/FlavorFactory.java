package com.cbn.flyweight.coffee;

import java.util.HashMap;

/**
 * 享元工厂-咖啡风味
 * 
 * @author boning
 *
 */
public class FlavorFactory {
	private static FlavorFactory factory = new FlavorFactory();
	private HashMap<String, Order> flavors = new HashMap<>();
	private int ordersMade = 0;
	private int totalFlavors = 0;

	private FlavorFactory() {

	}

	public static FlavorFactory getInstance() {
		return factory;
	}

	/*
	 * 工厂方法，根据所需要的风味提供咖啡
	 */
	public Order getOrder(String flavorToGet) {
		ordersMade++;
		Order temp = flavors.get(flavorToGet);
		if (null != temp)
			return temp;
		temp = new Flavor(flavorToGet);
		totalFlavors++;
		flavors.put(flavorToGet, temp);
		return temp;
	}

	public int getTotalFlavors() {
		return totalFlavors;
	}

	public int getOrdersMade() {
		return ordersMade;
	}
}
