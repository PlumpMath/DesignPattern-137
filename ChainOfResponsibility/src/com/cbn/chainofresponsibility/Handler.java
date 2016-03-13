package com.cbn.chainofresponsibility;
/**
 * 抽象处理者
 * @author boning
 *
 */
abstract public class Handler {
	protected Handler successor;
	public abstract void handleRequest();
	public void setSuccessor(Handler successor){
		this.successor = successor;
	}
	
	public Handler getSuccessor(){
		return successor;
	}
}
