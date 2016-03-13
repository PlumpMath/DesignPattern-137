package com.cbn.command.example;

public class RewindCommand implements Command{
	private AudioPlayer audioPlayer;
	public RewindCommand(AudioPlayer audioPlayer){
		this.audioPlayer = audioPlayer;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		audioPlayer.rewind();
	}

}
