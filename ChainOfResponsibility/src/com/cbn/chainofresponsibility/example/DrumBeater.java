package com.cbn.chainofresponsibility.example;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 击鼓
 * @author boning
 *
 */
public class DrumBeater {
	private static Player firstPlayer;
	public static boolean stopped = false;
	
	Timer timer;
	
	public static void main(String[] args) {
		DrumBeater drumBeater = new DrumBeater();
		JiaMu jiaMu = new JiaMu(null);
		jiaMu.setSuccessor(new JiaShe(new JiaZheng(new JiaBaoYu(new JiaHuan(jiaMu)))));
		//开始击鼓
		drumBeater.startBeating(1);
		firstPlayer = jiaMu;
		firstPlayer.handler();
	}

	private void startBeating(int stopInseconds) {
		System.out.println("开始击鼓穿花");
		timer = new Timer();
		timer.schedule(new StopBeatingReminder(), stopInseconds * 100);
	}
	class StopBeatingReminder extends TimerTask{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("击鼓传花停止...");
			stopped = true;
			timer.cancel();
		}
		
	}
}
