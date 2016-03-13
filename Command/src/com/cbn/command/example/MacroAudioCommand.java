package com.cbn.command.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MacroAudioCommand implements MacroCommand {

	private List<Command> list = new ArrayList<>();

	@Override
	public void execute() {
		System.out.println("历史操作记录");
		for (Command e : list) {
			e.execute();
		}
		System.out.println("重新执行了这些操作...");
	}

	@Override
	public void remove(int index) {
		list.remove(index);
	}

	@Override
	public void add(Command e) {
		list.add(e);
	}

}
