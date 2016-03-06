package com.cbn.composite;

/**
 * 合成模式
 * 
 * 一个绘图的例子,使用安全合成模式，只有树枝构建才有配备管理聚集的方法。
 * @author boning
 *
 */
public class Client {
	public static void main(String[] args) {
		Picture picture = new Picture();
		Line line = new Line();
		Rectangle rect = new Rectangle();
		Circle circle = new Circle();
		
		picture.add(line);
		picture.add(rect);
		picture.add(circle);
		
		picture.draw();
	}
}
