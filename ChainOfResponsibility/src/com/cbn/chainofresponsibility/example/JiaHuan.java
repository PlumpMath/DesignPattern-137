package com.cbn.chainofresponsibility.example;

public class JiaHuan extends Player{
	public JiaHuan(Player successor){
		this.setSuccessor(successor);
	}
	@Override
	public void handler() {
		if(DrumBeater.stopped){
			System.out.println("Jiahuan喝");
		}else{
			System.out.println("跳过jianhuan");
			next();
		}
	}
}
