package com.WellsBank.debug;

import java.util.HashSet;
import java.util.Set;


public class Debug {

	public void showRecords(Set<String> set) {
		if(!set.isEmpty()) {
			 for(String s: set) {
				 System.out.println(s);
			 }
		}
		else {
			System.out.println("Set is an empty set");
		}
			
			
	}
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Lourie");
		set.add("Amy");
		set.add("Richard");
		set.add("Mark");
		Debug debug = new Debug();
		System.out.println("Printing the records.......");
		debug.showRecords(set);
		
	}
}
