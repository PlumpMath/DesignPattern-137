package com.cbn.singleton;
/**
 * 单例模式，确保一个类只有一个实例
 * 饿汉式
 * 懒汉式
 * @author boning
 *
 */
public class Client {
	public static void main(String[] args) {
//		LazySingleton01 lazySingleton01 = LazySingleton01.getInstance();
//		lazySingleton01.test();
//		LazySingleton02 lazySingleton02 = LazySingleton02.getInstance();
//		lazySingleton02.test();
		SingletonEnum instance = SingletonEnum.INSTANCE;
		instance.whateverMethod();
	}
}
