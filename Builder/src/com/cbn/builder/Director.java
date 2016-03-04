package com.cbn.builder;
/**
 * 导演类角色
 * 调用具体建造者以创建产品对象。
 * @author boning
 *
 */
public class Director {
	private IBuilder builder;
	public Director(IBuilder builder){
		this.builder = builder;
	}
	public void construct(IBuilder builder){
		builder.buildPart1();
		builder.buildPart2();
		
	}
}
