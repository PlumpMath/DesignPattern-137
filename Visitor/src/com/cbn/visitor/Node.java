package com.cbn.visitor;
/**
 * 抽象节点角色 声明一个接受操作，接受一个访问者对象作为一个参量
 * 
 * @author boning
 *
 */
public abstract class Node {
	abstract public void accept(Visitor visitor);
}
