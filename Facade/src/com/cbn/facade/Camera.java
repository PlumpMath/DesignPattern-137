package com.cbn.facade;

public class Camera {
	public void turnOn() {
		System.out.println("打开摄像头");
	}

	public void turnOff() {
		System.out.println("关闭摄像头");
	}

	public void rotate(int degrees) {
		System.out.println("旋转摄像头" + degrees + "度");
	}
}
