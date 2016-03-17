package com.cbn.state.examplelaoshandaoshi;

public class WallEntryException extends Exception{
	public WallEntryException(String s) {
		super(s);
		System.out.println(s);
	}
}
