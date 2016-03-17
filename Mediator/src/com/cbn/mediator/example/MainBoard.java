package com.cbn.mediator.example;

public class MainBoard implements Mediator{
	private CDDriver cdDriver;//需要知道交互的同事类-光驱类
	private CPU cpu;//需要知道交互的同事类-CPU
	private VideoCard videoCard;//需要知道交互的同事类-显卡
	private SoundCard soundCard;//需要知道交互的同事类-声卡
	
	
	
	public CDDriver getCdDriver() {
		return cdDriver;
	}



	public void setCdDriver(CDDriver cdDriver) {
		this.cdDriver = cdDriver;
	}



	public CPU getCpu() {
		return cpu;
	}



	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}



	public VideoCard getVideoCard() {
		return videoCard;
	}



	public void setVideoCard(VideoCard videoCard) {
		this.videoCard = videoCard;
	}



	public SoundCard getSoundCard() {
		return soundCard;
	}



	public void setSoundCard(SoundCard soundCard) {
		this.soundCard = soundCard;
	}


	/**
	 * 处理各个同事之间的逻辑
	 */
	@Override
	public void changed(Colleague c) {
		if(c instanceof CDDriver){
			//表示光驱读取数据了
			this.openCDReadData((CDDriver)c);
		}else if(c instanceof CPU){
			this.openCpu((CPU)c);
		}
	}



	private void openCpu(CPU c) {
		//先获取CPU处理后的数据
		String videoData = c.getVideoData();
		String soundData = c.getSoundData();
		//把这些数据传递给显卡和声卡展示出来
		videoCard.showData(videoData);
		soundCard.showSound(soundData);
	}



	private void openCDReadData(CDDriver c) {
		String data = c.getData();
		cpu.executeData(data);
	}

}
