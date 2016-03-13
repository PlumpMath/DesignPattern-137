package com.cbn.command;
/**
 * 命令模式
 * 
 * 是对命令的封装。命令模式把发出命令的责任和执行命令的责任分割开，委派给不同的对象。
 * 
 * 涉及到5个角色：
 * 1.客户端角色 创建了一个具体命令对象并确定其接受者
 * 2.命令角色 声明了一个给所有具体命令类的抽象接口
 * 3.具体命令角色 定义一个接受者和行为之间的弱耦合，实现execute方法，负责调用接受者的相应操作
 * 4.请求者角色 负责调用命令对象执行请求
 * 5.接受者角色 负责具体实施和执行一个请求
 * 
 * @author boning
 *
 */
public class Client {
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command command = new ConcreteCommand(receiver);
		Invoker invoker = new Invoker(command);
		invoker.action();
	}
}
