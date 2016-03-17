package com.cbn.state.exampletcp;

public class TcpListen implements TcpState{

	@Override
	public void open() {
		
	}

	@Override
	public void close() {
		
	}

	@Override
	public void acknowledge() {
		System.out.println("收听数据");
	}
	
}
