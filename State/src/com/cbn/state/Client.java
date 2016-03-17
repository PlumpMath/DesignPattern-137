package com.cbn.state;
/**
 * 状态模式
 * 状态模式允许一个对象在其内部状态改变的时候改变其行为。
 * 用一句话来说，状态模式把所研究的对象的行为包装在不同的状态对象里，每一个状态对象都属于一个抽象状态类的子类。
 * 
 * 模式所涉及的角色：
 * 1.抽象状态角色，定义一个接口，用以封装环境对象的一个特定的状态所对应的行为
 * 2.具体状态角色，每一个具体状态类都实现了环境的一个状态对应的行为
 * 3.环境角色，定义客户端所感兴趣的接口，并且保留一个具体状态类的实例。
 * 
 * 通过使用多态性原则，可以动态地改变环境类Context的属性State的内容，使其从指向一个具体状态类变换到指向另一个具体状态类，从而使环境类的行为由不同的具体状态类来执行。
 * 
 * 本模式在实现时有以下这些值得注意的地方
 * 1.谁来定义状态的变化，可以使环境类，也可以是具体的状态类
 * 2.状态对象的创立和湮灭
 * @author boning
 *
 */
public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		context.setState(new ConcreteState1());
		context.sampleOperation();
		context.setState(new ConcreteState2());//改变状态
		context.sampleOperation();
	}
}
