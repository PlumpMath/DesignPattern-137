package com.cbn.mediator;
/**
 * 调停者模式（中介者），迪米特法则
 * 调停者模式的角色：
 * 1.抽象调停者角色：定义出同事对象到调停者对象的接口
 * 2.具体调停者角色：
 * 3.抽象同事类角色
 * 4.具体同事类角色
 * @author boning
 *
 */
public class Client {
	public static void main(String[] args) {
		ConcreteMediator mediator = new ConcreteMediator();
		mediator.createConcreteMediator();
		Colleague c1 = new Colleague1(mediator);
		Colleague c2 = new Colleague2(mediator);
		/**
		 * 在某一个同事对象的装填发生变化时，这个同事对象需要通过调停者对象的事件方法通知其他的同事对象采取行动
		 * 比如Colleague1对象发生了状态变化，这时它调用Mediator对象的时间方法colleagueChanged，并将
		 * 自己作为参量传给Mediator对象。后者则根据商业逻辑通过调用Colleague1和Colleague2的行动方法action将
		 * 这个信息传给所有有关的同事对象。
		 * 
		 * 在一个复杂的系统中，调停者在事件发生时不一定会通知所有的同事对象，而仅仅会通知相关的同事对象
		 */
		//调停者通知其他同事
		mediator.colleagueChanged(c1);
		//具体同事类2调用调停者，再去通知其他同事
		c2.operation();
	}
}
