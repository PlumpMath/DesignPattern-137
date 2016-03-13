package com.cbn.chainofresponsibility.example;

public class JiaShe extends Player{
	public JiaShe(Player successor){
		this.setSuccessor(successor);
	}
	@Override
	public void handler() {
		if(DrumBeater.stopped){
			System.out.println("jiashe喝");
		}else{
			System.out.println("跳过jiashe");
			next();
		}
	}

}
