package com.cbn.visitor;
/**
 * 访问者模式
 * 是封装一些施加于某种数据结构元素之上的操作。一旦这些操作需要修改的话，接受这个操作的数据结构则可以保持不变。
 * 
 * 访问者模式适用于数据结构相对未定的系统，它把数据结构和作用于结构上的操作之间的耦合解脱开，使得操作集合可以相对自由地演化。
 * 数据结构的每一个节点都可以接受一个访问者的调用，此节点向访问者对象传入节点本身，而访问者对象则反过来执行节点对象的操作。
 * 这样的过程叫双重分派。节点调用访问者，将它自己传入，访问者则将某算法针对此节点执行。
 * 双重分派意味着施加于节点之上的操作是基于访问者和节点本身的数据类型，而不仅仅是其中的一者。
 * 
 * 在什么情况下应当使用访问者模式：
 * 访问者模式仅当在访问的类结构非常稳定的情况下使用，换言之，系统很少出现需要加入新节点的情况
 * @author boning
 *
 */
public class Client {
	private static ObjectStructure aObjectStructure;
	private static Visitor visitor;
public static void main(String[] args) {
	aObjectStructure = new ObjectStructure();
	aObjectStructure.add(new NodeA());
	aObjectStructure.add(new NodeB());
	visitor = new VisitorA();//创建一个A类访问者
	aObjectStructure.action(visitor);//让A类访问者访问对象
}
}
