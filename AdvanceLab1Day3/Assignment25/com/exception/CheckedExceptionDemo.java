package com.exception;

public class CheckedExceptionDemo {
	public static void main(String[] args) {
		//ExceptionDemo e = new ExceptionDemo();
		try {
			Class.forName("com.exception.ExceptionDemo");
		}
		catch(ClassNotFoundException exception) {
			System.out.println("Exception : " + exception);
		}
		
	}
	
}
