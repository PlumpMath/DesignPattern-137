package com.cbn.mediator.example;
/**
 * 调停者模式例子
 * 使用电脑来看电影
 * 1.首先是光驱要读取光盘上的数据，然后告诉主板，它的状态改变了
 * 2.主板去得到光驱的数据，把这些数据交给cpu进行分析处理
 * 3.cpu处理完后，把数据分成了视频数据和音频数据，通知主板，它处理完了
 * 4.主板去得到cpu处理后的数据，分别把数据交给显卡和声卡，去显示出视频和发出声音
 * @author boning
 *
 */
public class Client {
	public static void main(String[] args) {
		//创建调停者-主板
		MainBoard mainBoard = new MainBoard();
		//创建同事类
		CDDriver cd = new CDDriver(mainBoard);
		CPU cpu = new CPU(mainBoard);
		VideoCard video = new VideoCard(mainBoard);
		SoundCard sound = new SoundCard(mainBoard);
		
		//让调停者知道所有同事
		mainBoard.setCdDriver(cd);
		mainBoard.setCpu(cpu);
		mainBoard.setSoundCard(sound);
		mainBoard.setVideoCard(video);
		
		//开始看电影，把光盘放入光驱，光驱开始读盘
		cd.readCD();
	}
}
