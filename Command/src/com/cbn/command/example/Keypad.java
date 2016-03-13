package com.cbn.command.example;
/**
 * 请求者角色
 * @author boning
 *
 */
public class Keypad {
	private Command playCmd;
	private Command rewindCmd;
	private Command stopCmd;
	
	public Keypad(Command play, Command stop, Command rewind){
		this.playCmd = play;
		this.stopCmd = stop;
		this.rewindCmd = rewind;
	}
	
	public void play(){
		playCmd.execute();
	}
	
	public void stop(){
		stopCmd.execute();
	}
	
	public void rewind(){
		rewindCmd.execute();
	}
}
