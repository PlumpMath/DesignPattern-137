package com.cbn.chainofresponsibility.example;

public class JiaZheng extends Player{
	public JiaZheng(Player successor){
		this.setSuccessor(successor);
	}
	@Override
	public void handler() {
		if(DrumBeater.stopped){
			System.out.println("JiaZheng喝");
		}else{
			System.out.println("跳过JiaZheng");
			next();
		}
	}
}
