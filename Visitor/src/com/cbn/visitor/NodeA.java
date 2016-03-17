package com.cbn.visitor;

public class NodeA extends Node {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	/**
	 * A节点特有的商业方法
	 *
	 */
	public String operation() {
		return "A 节点被访问了";
	}

}
