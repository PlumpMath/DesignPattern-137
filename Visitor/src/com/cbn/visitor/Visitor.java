package com.cbn.visitor;
/**
 * 抽象访问者角色，由于有两个节点，因此，对应就有两个访问操作。
 * @author boning
 *
 */
public interface Visitor {
	void visit(NodeA node);
	void visit(NodeB node);
}
