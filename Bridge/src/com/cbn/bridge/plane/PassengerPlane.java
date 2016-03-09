package com.cbn.bridge.plane;
/**
 * 修正化抽象角色
 * @author boning
 *
 */
public class PassengerPlane extends AirPlane{
	public PassengerPlane(AirPlaneMaker airPlaneMaker) {
		this.airPlaneMaker = airPlaneMaker;
	}
	@Override
	public void fly() {
		this.airPlaneMaker.produce();
		System.out.println("并且，它是载人飞机");
	}

}
