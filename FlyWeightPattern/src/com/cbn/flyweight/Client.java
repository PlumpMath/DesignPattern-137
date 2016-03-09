package com.cbn.flyweight;
/**
 * 享元模式，以共享的方式高效地支持大量的细粒度对象
 * 要做到区分内蕴状态和外蕴状态
 * 一个内蕴状态是存储在享元对象内部的，并且是不随环境改变而有所不同的。
 * 一个外蕴状态是随环境改变而改变的，不可以共享的状态
 * @author boning
 *
 */
public class Client {
public static void main(String[] args) {
	//客户端必须通过工厂对象，利用一个factory方法得到享元对象。
	
	//创建一个享元工厂对象
	FlyweightFactory factory = new FlyweightFactory();
	//向享元工厂对象请求一个内蕴状态为'a'的享元对象
	Flyweight fly = factory.factory(new Character('a'));
	//以参量的形式传入一个外蕴状态
	fly.operation("First call");
	fly = factory.factory(new Character('b'));
	fly.operation("Second call");
	fly = factory.factory(new Character('a'));
	fly.operation("Third call");
}
}
