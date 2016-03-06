package com.cbn.composite;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

/**
 * 树枝构建角色
 * @author boning
 *
 */
public class Picture extends Graphics{
	private Vector<Graphics> list = new Vector<>();
	@Override
	public void draw() {
		for(Graphics g: list){
			g.draw();
		}
	}
	//聚集操作
	public void add(Graphics g){
		list.add(g);
	}
	
	public void remove(Graphics g){
		list.remove(g);
	}
	public Graphics getChild(int index){
		return list.get(index);
	}
}
