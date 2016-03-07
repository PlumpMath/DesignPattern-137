package com.cbn.proxy.zhinengyinyong;

public class AccessValidator {

	public boolean validateUser(String userID) {
		if("Admin".equals(userID))
		return true;
		return false;
	}

}
