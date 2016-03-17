package com.cbn.mediator.example;

public class SoundCard extends Colleague{
	private String soundData = "";
	public SoundCard(Mediator mediator) {
		super(mediator);
	}
	public String getSoundData() {
		return soundData;
	}
	public void setSoundData(String soundData) {
		this.soundData = soundData;
	}
	public void showSound(String data){
		System.out.println("画外音："+data);
	}
}
