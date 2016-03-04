package com.cbn.builder;
/**
 * 抽象创建者角色
 * 给出一个抽象接口，以规范产品对象的各个组成成分的建造
 * 一种是建造方法
 * 一种是结果返回方法
 * 一般来说，产品所包含的零件数目与建造方法的数目相符。
 * @author boning
 *
 */
public interface IBuilder {
	void buildPart1();
	void buildPart2();
}
