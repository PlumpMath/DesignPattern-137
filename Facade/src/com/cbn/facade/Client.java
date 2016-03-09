package com.cbn.facade;
/**
 * 门面模式（迪米特法则）
 * 外部与一个子系统的通信必须通过一个统一的门面对象进行
 * @author boning
 *
 */
public class Client {
	public static void main(String[] args) {
		SecurityFacade facade = new SecurityFacade();
		facade.activate();
		facade.deactivate();
	}
}
