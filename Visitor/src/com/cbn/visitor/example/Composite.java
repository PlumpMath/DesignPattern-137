package com.cbn.visitor.example;

import java.util.ArrayList;

/**
 * 树枝角色
 * @author boning
 *
 */
public abstract class Composite extends Equipment{
	protected ArrayList<Equipment> equipments;
	
	public Composite() {
		this.equipments = new ArrayList<>();
	}
	
	public void add(Equipment equipment){
		this.equipments.add(equipment);
	}
	
	public void remove(int index){
		this.equipments.remove(index);
	}
	
	@Override
	public double price() {
		double price = 0.0d;
		for(Equipment e:equipments){
			price += e.price();
		}
		return price;
	}
	
	@Override
	public void accept(Visitor vis) {
		for(Equipment e: equipments){
			e.accept(vis);
		}
	}
}
