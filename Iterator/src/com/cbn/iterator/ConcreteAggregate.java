package com.cbn.iterator;

public class ConcreteAggregate extends Aggregate{
	private Object[] obj = {"猴子","猫","老鼠","虎"};
	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}
	
	public Object getElement(int index){
		if(index < obj.length){
			return obj[index];
		}else{
			return null;
		}
	}
	public int size(){
		return obj.length;
	}
}
