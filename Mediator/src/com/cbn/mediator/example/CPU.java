package com.cbn.mediator.example;

public class CPU extends Colleague{
	private String videoData = "";//分解出来的视频数据
	private String soundData = "";//分解出来的音频数据
	
	public CPU(Mediator mediator) {
		super(mediator);
	}

	public String getVideoData() {
		return videoData;
	}

	public String getSoundData() {
		return soundData;
	}
	
	public void executeData(String data){
		String[] array = data.split(",");
		this.videoData = array[0];
		this.soundData = array[1];
		//通知主板，自己工作已经完成
		getMediator().changed(this);
	}
}
