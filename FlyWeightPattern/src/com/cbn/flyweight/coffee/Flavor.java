package com.cbn.flyweight.coffee;
/**
 * 具体享元角色
 * @author boning
 *
 */
public class Flavor extends Order{
	private String flavor;//内蕴状态
	
	public Flavor(String flavor) {
		this.flavor = flavor;
	}
	
	@Override
	public void serve() {
		System.out.println("提供咖啡，风味是"+flavor);
	}

	@Override
	public String getFlavor() {
		
		return flavor;
	}

}
