package com.cbn.bridge.plane;
/**
 * 空中巴士、波音和麦道都是飞机制造商，他们都生产载客飞机和载货飞机。现在需要设计一个系统来描述这些制造商以及他们所制造的飞机种类。
 * 
 * 从系统所面对的问题不难看出，代表飞机的抽象化的是它的类型，也就是客机或者货机；而代表飞机的实现化的则是飞机制造商。
 * @author boning
 *
 */
public class Client {
	public static void main(String[] args) {
		//三家不同的飞机制造商
		AirPlaneMaker airbus = new Airbus();
		AirPlaneMaker boeing = new Boeing();
		AirPlaneMaker md = new MD();
		
		//由空中巴士制造的载货飞机
		AirPlane plane01 = new CargoPlane(airbus);
		plane01.fly();
		
		//由md制造的载货飞机
		AirPlane plane02 = new CargoPlane(md);
		plane02.fly();
		
		//由波音制造的载人飞机
		AirPlane plane03 = new PassengerPlane(boeing);
		plane03.fly();
	}
}
