package com.cbn.visitor;

import java.util.ArrayList;

/**
 * 结构对象角色 持有一个聚集 并向外部提供add方法作为对聚集类的管理操作。
 * 
 * @author boning
 *
 */
public class ObjectStructure {
	private ArrayList<Node> nodes;

	public ObjectStructure() {
		this.nodes = new ArrayList<>();
	}

	public void add(Node node) {
		nodes.add(node);
	}

	public void action(Visitor visitor) {
		for (Node node : nodes) {
			node.accept(visitor);
		}
	}
}
