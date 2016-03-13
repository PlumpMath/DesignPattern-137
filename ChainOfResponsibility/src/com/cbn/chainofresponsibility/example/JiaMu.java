package com.cbn.chainofresponsibility.example;

public class JiaMu extends Player{
	public JiaMu(Player successor){
		this.setSuccessor(successor);
	}
	@Override
	public void handler() {
		if(DrumBeater.stopped){
			System.out.println("贾母喝");
		}else{
			System.out.println("跳过贾母");
			next();
		}
	}

}
