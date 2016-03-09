package com.cbn.bridge.plane;
/**
 * 修正化抽象角色
 * @author boning
 *
 */
public class CargoPlane extends AirPlane{
	public CargoPlane(AirPlaneMaker airPlaneMaker) {
		this.airPlaneMaker = airPlaneMaker;
	}
	@Override
	public void fly() {
		airPlaneMaker.produce();
		System.out.println("并且，它是载货飞机");
		
	}

}
