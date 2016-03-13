package com.cbn.chainofresponsibility.example;

public class JiaBaoYu extends Player{
	public JiaBaoYu(Player successor){
		this.setSuccessor(successor);
	}
	@Override
	public void handler() {
		if(DrumBeater.stopped){
			System.out.println("贾宝玉喝");
		}else{
			System.out.println("跳过贾宝玉");
			next();
		}
	}
}
