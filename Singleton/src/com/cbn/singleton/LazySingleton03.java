package com.cbn.singleton;
/**
 * 懒汉模式
 * 双重检索
 * @author boning
 *
 */
public class LazySingleton03 {
	private volatile static LazySingleton03 singleton;//volatile原子性
	private LazySingleton03(){
		
	}
	public static LazySingleton03 getInstance(){
		if (singleton == null) {
			synchronized (LazySingleton03.class) {
				if (singleton == null) {
					singleton = new LazySingleton03();
				}
			}
		}
		return singleton;
	}
}
