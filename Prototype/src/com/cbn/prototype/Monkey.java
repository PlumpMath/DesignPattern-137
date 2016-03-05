package com.cbn.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * 具体原型角色
 * @author boning
 *
 */
public class Monkey implements Cloneable, Serializable{
	private int height;
	private int weight;
	private GoldRingeStaff staff;
	private Date birthDate;
	
	public Monkey() {
		this.birthDate = new Date();
		this.staff = new GoldRingeStaff();
	}
	
	/**
	 * 浅复制，金箍棒只是引用复制。
	 * @return
	 */
	@Override
	public Object clone(){
		Monkey temp = null;
		try{
			temp = (Monkey) super.clone();
			temp.birthDate = (Date) birthDate.clone();
		}catch(CloneNotSupportedException e){
			System.out.println("Clone failed...");
		}
		return temp;
	}

	public Object deepClone() throws IOException, ClassNotFoundException{
		//首先将对象写到流里
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		ObjectOutputStream oo = new ObjectOutputStream(bo);
		oo.writeObject(this);
		//然后将对象从流里读出来
		ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
		ObjectInputStream oi = new ObjectInputStream(bi);
		return oi.readObject();
	}
	
	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public GoldRingeStaff getStaff() {
		return staff;
	}


	public void setStaff(GoldRingeStaff staff) {
		this.staff = staff;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
}
