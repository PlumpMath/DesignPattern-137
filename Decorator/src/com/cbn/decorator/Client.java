package com.cbn.decorator;

/**
 * 装饰模式 齐天大圣的例子，孙悟空有72变，他变成鱼儿，可以多个游泳功能， 变成鸟儿，多个飞行功能。
 * 
 * @author boning
 *
 */
public class Client {
	public static void main(String[] args) {
		TheGreatestSage sage = new Monkey();
		//第一种写法，全透明，给客户端的方法全是接口统一的
		TheGreatestSage bird = new Bird(sage);
		TheGreatestSage fish = new Fish(bird);
		fish.move();
		
		//第二种写法,半透明，可以调装饰类的自带方法
		Fish fish2 = new Fish(sage);
		fish2.change();
	}
}
