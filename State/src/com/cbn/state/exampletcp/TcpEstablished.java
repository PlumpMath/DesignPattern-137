package com.cbn.state.exampletcp;

public class TcpEstablished implements TcpState{

	@Override
	public void open() {
		System.out.println("tcp连接建立成功");
	}

	@Override
	public void close() {
		
	}

	@Override
	public void acknowledge() {
		
	}

}
