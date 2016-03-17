package com.cbn.mediator.example;

public class CDDriver extends Colleague{
	private String data = "";//光驱读到的数据
	public CDDriver(Mediator mediator) {
		super(mediator);
	}
	
	public String getData(){
		return data;
	}
	
	public void readCD(){
		//逗号前是视频的数据，逗号后是音频数据
		this.data = "One Piece,海贼王我当定了";
		//通知主板，自己的状态发生了改变
		getMediator().changed(this);
	}
	
}
