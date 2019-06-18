package com.WellsBank.records;

import java.util.HashSet;
import java.util.Set;

public class EntrySet {
	public void printSetRecords(Set<String> set) {
		if(set.isEmpty()) {
			System.out.println("Set is an empty set");
		}
		else {
			System.out.println("Set elements are : " + set);
		}
	}
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("First Entry");
		set.add("Second Entry");
		set.add("Third Entry");
		set.add("First Entry");
		EntrySet setDemo = new EntrySet();
		setDemo.printSetRecords(set);
		Set<String> emptyset = new HashSet<>();
		setDemo.printSetRecords(emptyset);
	}
}
