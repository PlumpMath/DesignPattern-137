package com.cbn.state.exampletcp;

public interface TcpState {
	void open();
	void close();
	void acknowledge();
}
