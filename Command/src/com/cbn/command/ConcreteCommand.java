package com.cbn.command;
/**
 * 具体命令角色
 * @author boning
 *
 */
public class ConcreteCommand implements Command {
	private Receiver receiver;

	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.action();
	}

}
