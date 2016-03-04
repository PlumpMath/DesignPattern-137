package com.cbn.singleton;

/**
 * 懒汉式 通过静态内部类的方式
 * 
 * @author boning
 *
 */
public class LazySingleton02 {
	private LazySingleton02() {
	}

	public static LazySingleton02 getInstance() {
		return MySingleton.m_instance;
	}

	private static class MySingleton {
		private static LazySingleton02 m_instance = null;

		static {
			System.out.println("内部类的静态代码块开始加载...");
			m_instance = new LazySingleton02();
		}

		private MySingleton() {
			System.out.println("内部类的构造函数开始...");
		}

	}
	
	public void test(){
		System.out.println("懒汉式02的测试方法...");
	}
}
