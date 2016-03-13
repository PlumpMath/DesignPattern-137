package com.cbn.command.example2;

public class ChannelCommand implements Command {
	private Tv tv;

	public ChannelCommand(Tv tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.changeChannel();
	}

}
