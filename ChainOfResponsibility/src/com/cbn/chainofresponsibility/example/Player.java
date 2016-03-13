package com.cbn.chainofresponsibility.example;

abstract public class Player {
	abstract public void handler();

	private Player successor;

	public Player() {
		successor = null;
	}

	public Player getSuccessor() {
		return successor;
	}

	public void setSuccessor(Player successor) {
		this.successor = successor;
	}
	
	public void next(){
		if(successor != null){
			successor.handler();
		}else{
			System.out.println("程序停止");
			System.exit(0);
		}
	}
}
