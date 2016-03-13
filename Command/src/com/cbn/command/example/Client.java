package com.cbn.command.example;

/**
 * AudioPlayer系统 实现这个录音机的模拟系统。 此系统有Play、Rewind、Stop功能。录音机的键盘便是请求者，录音机是接受者角色。
 * 开始扩展：增加宏命令功能,可以把一个个的命令记录下来，再在任何需要的时候重新把这些记录下来的命令一次性执行
 * 
 * @author boning
 *
 */
public class Client {
	private static Keypad keypad;
	private static AudioPlayer myAudio = new AudioPlayer();

	public static void main(String[] args) {
//		test1();
		test2();
	}

	private static void test1() {
		Command play = new PlayCommand(myAudio);
		Command stop = new StopCommand(myAudio);
		Command rewind = new RewindCommand(myAudio);

		keypad = new Keypad(play, stop, rewind);
		keypad.play();
		keypad.stop();
		keypad.rewind();

		keypad.play();
		keypad.stop();
	}

	private static void test2() {
		Command play = new PlayCommand(myAudio);
		Command stop = new StopCommand(myAudio);
		Command rewind = new RewindCommand(myAudio);
		MacroCommand macro = new MacroAudioCommand();
		macro.add(play);
		macro.add(stop);
		macro.add(rewind);
		macro.add(play);
		macro.add(stop);
		macro.execute();
	}
}
