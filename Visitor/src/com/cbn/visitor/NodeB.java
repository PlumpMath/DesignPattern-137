package com.cbn.visitor;

public class NodeB extends Node {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	/**
	 * 节点B 所特有的商业方法
	 */
	public String operation() {
		return "B节点被访问了";
	}
}
