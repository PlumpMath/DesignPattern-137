package com.cbn.state.exampletcp;

public class TcpClosed implements TcpState{

	@Override
	public void open() {
	}

	@Override
	public void close() {
		System.out.println("tcp关闭");
	}

	@Override
	public void acknowledge() {
	}

}
