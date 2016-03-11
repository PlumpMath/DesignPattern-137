package com.cbn.templatemethod;
/**
 * 模板方法模式。
 * 准备一个抽象类，将部分逻辑以具体方法以及具体构造子的形式实现，然后申明一些抽象方法来迫使子类实现剩余的逻辑。
 * 不同的子类可以不同的方式实现这些抽象方法。
 * @author boning
 *
 */
public class Client {
	public static void main(String[] args) {
		AbstractClass muban = new ConcreteClass();
		muban.templateMethod();
	}
}
