package com.cbn.templatemethod.example;

public class MoneyMarketAccount extends Account{

	@Override
	protected double doCalculateInterestRate() {
		// TODO Auto-generated method stub
		return 0.045D;
	}

	@Override
	protected String doCalculateAccountType() {
		// TODO Auto-generated method stub
		return "Money Market";
	}
	
}
