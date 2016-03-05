package com.cbn.prototype;

import java.io.Serializable;

/**
 * 金箍棒
 * @author boning
 *
 */
public class GoldRingeStaff implements Cloneable,Serializable{
	private float height = 100.0f;
	private float diameter = 10.0f;
	public GoldRingeStaff() {
		
	}
	
	public void grow(){
		this.diameter *= 2.0f;
		this.height *= 2;
	}
	
	public void shrink(){
		this.diameter /= 2;
		this.height /= 2;
	}
	
	public void move(){
		
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getDiameter() {
		return diameter;
	}

	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}
}
