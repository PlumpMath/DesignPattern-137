package com.cbn.command.example2;

/**
 * 电视机模拟系统
 * 
 * @author boning
 *
 */
public class Client {
	private static Tv tv;
	private static Control control;

	public static void main(String[] args) {
		test1();
	}

	private static void test1() {
		tv = new Tv();
		control = new Control(new OnCommand(tv), new OffCommand(tv), new ChannelCommand(tv), new VolumeCommand(tv));
		control.turnOn();
		control.turnVolume();
		control.turnChannel();
		control.turnOff();

	}
}
