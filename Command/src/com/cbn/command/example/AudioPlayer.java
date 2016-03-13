package com.cbn.command.example;
/**
 * 接受者角色
 * @author boning
 *
 */
public class AudioPlayer {
	public void stop(){
		System.out.println("停止工作...");
	}
	
	public void rewind(){
		System.out.println("倒退开始...");
	}
	
	public void play(){
		System.out.println("开始播放...");
		
	}
}
