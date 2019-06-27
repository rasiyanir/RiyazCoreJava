package com.imcs.debug;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.imcs.customer.Customer;
import com.imcs.savingsAccount.SavingsAccount;

public class Debug implements Serializable{
	public static void main(String[] args) {
		Customer customer = new Customer(1001, "Tan");
		
		SavingsAccount sb1 = new SavingsAccount(9001, customer, 2000, 5, 1000);
		
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objStream = null;;
		FileInputStream fileInput = null;
		ObjectInputStream objectStream = null;
		
		try {
			fileOutputStream = new FileOutputStream("data.ser");
			objStream = new ObjectOutputStream(fileOutputStream);
			//objStream.close();
			objStream.writeObject(sb1);
			
			fileInput = new FileInputStream("data.ser");
			objectStream = new ObjectInputStream(fileInput);
			SavingsAccount deserializedSb = (SavingsAccount)objectStream.readObject();
			System.out.println(deserializedSb.getAccountNo());
		}
		catch(IOException ioException) {
			System.out.println("io1Exception");
		}
		catch(ClassNotFoundException classNotFoundException) {
			System.out.println("classNotFoundException");
		}
		finally {
			if(fileInput!=null) {
				try {
					fileInput.close();
				}
				catch(IOException ioException) {
					System.out.println("io2Exception");
				}
			}
			if(objStream!=null) {
				try {
					objStream.close();
				}
				catch(IOException ioException) {
					System.out.println("io3Exception");
				}
			}
			if(fileOutputStream!=null) {
				try {
					fileOutputStream.close();
				}
				catch(IOException ioException) {
					System.out.println("io4Exception");
				}
			}
			if(objectStream!=null) {
				try {
					objectStream.close();
				}
				catch(IOException ioException) {
					System.out.println("io5Exception");
				}
			}
		}
		
	}
}
