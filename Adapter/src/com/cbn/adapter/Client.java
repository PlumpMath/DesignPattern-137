package com.cbn.adapter;
/**
 * 适配器模式
 * 把一个类的接口变换成客户端所期待的另一种接口，从而使原本因接口不匹配而无法再一起工作的两个类能够一起工作。
 * @author boning
 *这个例子是利用适配器模式指方为园
 */
public class Client {
	//客户端需要BallF的实现类，而我们所拥有的确实Cube的类，它不满足BallF的接口，我们通过MagicFinger适配
	
	public static void main(String[] args) {
		BalllF ballf = new MagicFinger(new Cube(4));
		System.out.println("球的面积是"+ballf.calculateArea());
		System.out.println("球的体积是"+ballf.calculateVolume());
	}
	
}
