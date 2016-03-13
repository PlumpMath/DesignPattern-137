package com.cbn.memento;

/**
 * 备忘录角色
 * 
 * 如果是多个检查点，那么可以用一个聚集类保存状态
 * 
 * @author boning
 *
 */
public class Memento {
	private String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return this.state;
	}
}
