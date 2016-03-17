package com.cbn.visitor;

public class VisitorA implements Visitor {

	@Override
	public void visit(NodeA node) {
		System.out.println(node.operation());
	}

	@Override
	public void visit(NodeB node) {
		System.out.println(node.operation());
	}

}
