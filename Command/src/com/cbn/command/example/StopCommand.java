package com.cbn.command.example;

public class StopCommand implements Command{
	private AudioPlayer audioPlayer;
	public StopCommand(AudioPlayer audioPlayer){
		this.audioPlayer = audioPlayer;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		audioPlayer.stop();
	}

}
