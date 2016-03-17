package com.cbn.mediator.example;

public class VideoCard extends Colleague{
	private String data = "";
	public VideoCard(Mediator mediator) {
		super(mediator);
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public void showData(String data){
		System.out.println("您正在观看的是："+data);
	}
}
