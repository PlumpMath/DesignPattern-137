package com.cbn.command.example2;

public class VolumeCommand implements Command {
	private Tv tv;

	public VolumeCommand(Tv tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.turnVolume();
	}

}
