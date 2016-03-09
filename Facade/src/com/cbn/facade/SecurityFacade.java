package com.cbn.facade;

/**
 * 们面对像承担了与保安系统内各个对象打交道的任务，而客户对象只要与们面对像打交道即可。
 * 
 * @author boning
 *
 */
public class SecurityFacade {
	private Camera camera1, camera2;
	private Light light1, light2;
	private Sensor sensor;
	private Alarm alarm;

	public SecurityFacade() {
		camera1 = new Camera();
		camera2 = new Camera();
		light1 = new Light();
		light2 = new Light();
		sensor = new Sensor();
		alarm = new Alarm();
	}

	public void activate() {
		camera1.turnOn();
		camera2.turnOn();
		light1.turnOn();
		light2.turnOn();
		sensor.activate();
		sensor.trigger();
		alarm.activate();
	}

	public void deactivate() {
		alarm.stopRing();
		alarm.deactivate();
		sensor.deactive();
		light1.turnOff();
		light2.turnOff();
		camera1.turnOff();
		camera2.turnOff();
	}

}
