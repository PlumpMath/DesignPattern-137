package com.cbn.singleton;
/**
 * 枚举实现单例模式
 * @author boning
 *
 */
public enum SingletonEnum {
	INSTANCE;
	public void whateverMethod(){
		System.out.println("Hello,world");
	}
}
