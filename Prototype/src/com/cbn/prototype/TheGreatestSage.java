package com.cbn.prototype;

import java.io.IOException;

/**
 * 原型模式分浅复制、深复制
 * 
 * @author boning
 *
 */
public class TheGreatestSage {
	private Monkey monkey = new Monkey();

	public void change() {
		// 创建齐天大圣本尊对象
		Monkey copyMonkey;
		for (int i = 0; i < 2000; i++) {

		}
		// 克隆大圣本尊
		copyMonkey = (Monkey) monkey.clone();
		System.out.println("大圣的生日是 = " + monkey.getBirthDate());
		System.out.println("浅复制的猴子的生日是 = " + copyMonkey.getBirthDate());
		System.out.println("大圣 == 浅复制的猴子 ？" + (monkey == copyMonkey));
		System.out.println("大圣的生日对象 == 浅复制的猴子的生日对象 ？" + (monkey.getBirthDate() == copyMonkey.getBirthDate()));
		System.out.println("大圣的金箍棒 == 浅复制的猴子的金箍棒 ？" + (monkey.getStaff() == copyMonkey.getStaff()));
	}

	public void deepchange() throws IOException, ClassNotFoundException {
		Monkey copyMonkey;
		for (int i = 0; i < 2000; i++) {

		}
		copyMonkey = (Monkey) monkey.deepClone();
		System.out.println("大圣的生日是 = " + monkey.getBirthDate());
		System.out.println("深复制的猴子的生日是 = " + copyMonkey.getBirthDate());
		System.out.println("大圣 == 深复制的猴子 ？" + (monkey == copyMonkey));
		System.out.println("大圣的生日对象 == 深复制的猴子的生日对象 ？" + (monkey.getBirthDate() == copyMonkey.getBirthDate()));
		System.out.println("大圣的金箍棒 == 深复制的猴子的金箍棒 ？" + (monkey.getStaff() == copyMonkey.getStaff()));
	}
}
