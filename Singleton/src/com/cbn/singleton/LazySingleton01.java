package com.cbn.singleton;

/**
 * 懒汉式
 * 通过对方法加锁的方式保证线程安全
 * @author boning
 *
 */
public class LazySingleton01 {
	private static LazySingleton01 m_instance = null;

	private LazySingleton01() {

	}

	synchronized public static LazySingleton01 getInstance() {
		if (m_instance == null) {
			m_instance = new LazySingleton01();
		}
		return m_instance;
	}
	public void test(){
		System.out.println("懒汉式01的测试方法...");
	}
}
