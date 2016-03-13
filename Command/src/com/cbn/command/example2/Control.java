package com.cbn.command.example2;

/**
 * 控制器，请求者角色
 * 
 * @author boning
 *
 */
public class Control {
	private Command onCommand;
	private Command offCommand;
	private Command channelCommand;
	private Command volumeCommand;

	public Control(Command onCommand, Command offCommand, Command channelCommand, Command volumeCommand) {
		this.onCommand = onCommand;
		this.offCommand = offCommand;
		this.channelCommand = channelCommand;
		this.volumeCommand = volumeCommand;
	}

	public void turnOn() {
		onCommand.execute();
	}

	public void turnOff() {
		offCommand.execute();
	}

	public void turnChannel() {
		channelCommand.execute();
	}

	public void turnVolume() {
		volumeCommand.execute();
	}
}
