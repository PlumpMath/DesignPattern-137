package com.cbn.state.exampletcp;
/**
 * TCP 
 * @author boning
 *
 */
public class Client {
	private static TcpConnection connection;
	public static void main(String[] args) {
		connection = new TcpConnection();
		connection.setState(new TcpEstablished());
		connection.open();
		connection.setState(new TcpListen());
		connection.acknowledge();
		connection.setState(new TcpClosed());
		connection.close();
	}
}
