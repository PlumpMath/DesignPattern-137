package com.cbn.state;
/**
 * 环境类,持有一个State对象，并把所有的行为委派给此对象
 * @author boning
 *
 */
public class Context {
	private State state;
	
	public void sampleOperation(){
		state.sampleOperation();
	}
	
	public void setState(State state){
		this.state = state;
	}
}
