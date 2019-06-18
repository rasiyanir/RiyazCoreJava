package com.Wells.login;

import java.util.LinkedHashMap;
import java.util.Map;

public class Login {
	
	private Map<Integer, String> loginMap = new LinkedHashMap<>();
	
	public void addLogin(int customerId, String password) {
		loginMap.put(customerId, password);
	}
}
