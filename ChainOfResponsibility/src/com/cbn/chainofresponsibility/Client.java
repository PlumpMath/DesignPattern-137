package com.cbn.chainofresponsibility;
/**
 * 责任链模式
 * 在责任链模式里，很多对象由每一个对象对其下家的引用而连接起来形成一条链，
 * 请求在这个链上传递，直到链上的某一个对象处理次请求。
 * 
 * 抽象处理者：定义出一个处理请求的接口。如果需要，接口可以定义出一个方法，以设定和返回对下家的引用。
 * 具体处理者
 * 
 * 纯的责任链模式：要求一个具体的处理者对象只能在两个行为中选择一个：承担责任和把责任推给下家。
 * 不纯的责任链模式：
 * @author boning
 *
 */
public class Client {
	private static Handler handler1, handler2;
	public static void main(String[] args) {
		handler1 = new ConcreteHandler();
		handler2 = new ConcreteHandler();
		handler1.setSuccessor(handler2);
		
		handler1.handleRequest();
	}
}
