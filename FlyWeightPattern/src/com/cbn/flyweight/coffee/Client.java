package com.cbn.flyweight.coffee;
/**
 * 咖啡摊
 * 咖啡有内蕴状态，也就是咖啡的风味。每一种风味的咖啡之创建一个对象，实行共享
 * 凯飞没有环境因素，也就是没有外蕴状态
 * @author boning
 *
 */
public class Client {
	private static FlavorFactory factory;
	/**
	 * 客户端角色，代表咖啡摊的服务员
	 * @param args
	 */
	public static void main(String[] args) {
		factory = FlavorFactory.getInstance();
		
		takeOrders("黑咖啡").serve();
		takeOrders("卡普奇诺").serve();
		takeOrders("摩卡").serve();
		takeOrders("拿铁").serve();
		takeOrders("卡普奇诺").serve();
		takeOrders("黑咖啡").serve();
		System.out.println("现有"+factory.getTotalFlavors()+"种风味！");
		System.out.println("已经卖出"+factory.getOrdersMade()+"杯咖啡");
	}
	
	private static Order takeOrders(String aFlavor){
		return factory.getOrder(aFlavor);
	}
}
