package com.cbn.builder;
/**
 * 对象的创建模式，建造模式可以将一个产品的内部表象与产品的生成过程分割开来。从而可以使一个建造过程生成具有不同的内部表象的产品对象。
 * 例如，产品的组成成分作为产品的零件，可以叫做产品的内部表象。
 * 使用建造模式可以使客户端不需要知道所生成的产品对象有哪些零件，每个产品的对应零件彼此有何不同，是怎么建造出来的，以及怎么样组成产品。
 * @author boning
 *
 *建造者模式的本质和建造楼房一样的，即流程不变，但每个流程实现的具体细节则是经常变化。建造者模式的好处就是保证了流程不会变化，流程既不会增加也会不遗漏或者产生流程次序错误。
 */
public class Client {
	public static void main(String[] args) {
		IBuilder builder = new ConcreteBuilder2();//负责具体构建产品2
		Director director = new Director(builder);//负责定制建造过程的流程
		director.construct(builder);
		Product2 product2 = ((ConcreteBuilder2)builder).retrieveResult();
		product2.operation();
		
		builder = new ConcreteBuilder1();
		director = new Director(builder);
		director.construct(builder);
		Product1 product1 = ((ConcreteBuilder1)builder).retrieveResult();
		product1.operation();
		
	}
}
