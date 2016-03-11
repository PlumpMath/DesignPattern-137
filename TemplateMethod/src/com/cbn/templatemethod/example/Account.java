package com.cbn.templatemethod.example;

public abstract class Account {
	protected String accountNumber;
	public Account() {
		this.accountNumber = null;
	}
	public Account(String accountNumber){
		this.accountNumber = accountNumber;
	}
	
	/**
	 * 模板方法
	 */
	final public double calculateInterest(){
		double interestRate = doCalculateInterestRate();
		String accountType = doCalculateAccountType();
		double amount = calculateAmount(accountType,accountNumber);
		return amount * interestRate;
	}
	/**
	 * 两个基本方法留给子类实现
	 * @return
	 */
	abstract protected double doCalculateInterestRate();
	abstract protected String doCalculateAccountType();
	
	/**
	 * 基本方法，已经实现
	 */
	final protected double calculateAmount(String accountType, String accountNumber){
		return 7243.00D;
	}
}
