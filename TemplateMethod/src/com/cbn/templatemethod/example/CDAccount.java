package com.cbn.templatemethod.example;

public class CDAccount extends Account{

	@Override
	protected double doCalculateInterestRate() {
		return 0.065D;
	}

	@Override
	protected String doCalculateAccountType() {
		return "Certificate of Deposite";
	}

}
