package com.cbn.chainofresponsibility;
/**
 * 具体处理者的源代码
 * @author boning
 *
 */
public class ConcreteHandler extends Handler{

	@Override
	public void handleRequest() {
		// TODO Auto-generated method stub
		if(getSuccessor()!=null){
			System.out.println("这次的请求传给了"+getSuccessor());
			getSuccessor().handleRequest();
		}else{
			System.out.println("这次请求到这结束了");
		}
	}
}
