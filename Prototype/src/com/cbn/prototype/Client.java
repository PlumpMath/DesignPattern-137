package com.cbn.prototype;

import java.io.IOException;
/**
 * 原型模式
 * Object类的clone方法是一个本地方法，它直接操作内存中的二进制流，特别是复制大对象时，性能的差别非常明显。
 * 使用原型模式复制对象不会调用类的构造方法，因为对象的复制是通过调用Object类的clone方法来完成的，它直接在内存中复制数据。甚至连访问权限对原型模式都无效。
 * 深拷贝、与浅拷贝。Object类的clone方法只会拷贝对象中的基本的数据类型，对于数组、容器对象、引用对象都不会拷贝，这就是浅拷贝。
 * 深复制有两种方式，一直实现Cloneable接口，另一种实现Serializable接口。
 * @author boning
 *
 */
public class Client {
	public static void main(String[] args) {
		TheGreatestSage sage = new TheGreatestSage();
		sage.change();//浅复制，对象内的对象引用的对象仍为同一个。
		try {
			sage.deepchange();//深复制
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
