package com.cbn.flyweight;
/**
 * 抽象享元角色：那些需要外蕴状态的操作可以通过调用商业方法以参数的形式传入。
 * @author boning
 *
 */
abstract public class Flyweight {
	//一个示意性方法，参数是state外蕴状态
	abstract public void operation(String state);
}
