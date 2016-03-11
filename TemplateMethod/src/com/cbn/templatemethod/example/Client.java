package com.cbn.templatemethod.example;
/**
 * 考虑一个计算存款利息的例子。假设系统需要支持两种存款账号，即货币市场账号和定期存款账号。这两种账号的存款利息不同。
 * 这个系统的总行为应当是计算出利息，这也就决定了作为一个模板方法模式的顶级逻辑应当是利息计算。
 * 由于计算一个存户的存款利息涉及两个步骤：
 * 1。确定账户的类型
 * 2.确定利息百分比。
 * 这两个基本方法构成具体逻辑，因为账号的类型不同，所以具体逻辑会有所不同。
 * @author boning
 *
 */
public class Client {
	private static Account acct = null;
	public static void main(String[] args) {
		acct = new MoneyMarketAccount();
		System.out.println("来自市场账号的利息："+acct.calculateInterest());
		acct = new CDAccount();
		System.out.println("来自CD账号的利息："+acct.calculateInterest());
				
	}
}
