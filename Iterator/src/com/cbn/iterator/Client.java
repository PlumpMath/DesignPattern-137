package com.cbn.iterator;
/**
 * 迭代子模式
 * 可以顺序地访问一个聚集中的元素而不必暴露聚集的内部表象
 * 
 * 一个聪明的办法是应当使用更加抽象的处理方法，是的在进行迭代时，客户端根本无需知道所使用的聚集是哪个类型；而当客户端需要使用全新的迭代逻辑时，只需要引入一个新的迭代子对象即可，无需修改聚焦对像本身
 * 
 * 迭代子模式是这样的一个抽象化的概念。这一模式将迭代逻辑封装到一个独立的迭代子对象中，从而与聚集本身分割开。
 * 迭代子对象是对遍历的抽象化，不同的聚集对象可以提供相同的迭代子对象，从而使客户端无需知道聚集的底层结构。
 * 一个聚集可以提供多个不同的迭代子对象，从而使得遍历逻辑的变化不会影响到聚集本身。
 * 
 * 迭代子模式涉及到几个角色：
 * 1.抽象迭代子
 * 2.具体迭代子
 * 3.聚集角色
 * 4.具体聚集角色
 * 5.客户端
 * 
 * 宽接口，可以修改聚集元素的
 * 窄接口，不可以修改聚集元素的
 * 
 * 外禀迭代子，迭代子是在聚集结构之外的
 * 内禀迭代子，在聚集结构内部
 * @author boning
 *
 */
public class Client {
	public static void main(String[] args) {
		Aggregate agg = new ConcreteAggregate();
		Iterator it = agg.createIterator();
		while(!it.isDone()){
			System.out.println(it.currentItem().toString());
			it.next();
		}
	}
}
