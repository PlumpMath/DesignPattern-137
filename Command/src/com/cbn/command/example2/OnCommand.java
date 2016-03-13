package com.cbn.command.example2;

public class OnCommand implements Command{
	private Tv tv;
	
	public OnCommand(Tv tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.turnOn();
	}

}
