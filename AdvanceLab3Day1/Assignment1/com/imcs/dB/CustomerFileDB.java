package com.imcs.dB;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.imcs.customer.Customer;

public class CustomerFileDB {
	String file = "data\\customer.dat";
	
	public int saveCustomer(Customer customer) {
		int status = -1;
		
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		
		try {
			fileWriter = new FileWriter(file, true);
			bufferedWriter = new BufferedWriter(fileWriter);
			String data = customer.getCustomerId() + ":" + customer.getCustomerName() + "\n";
			bufferedWriter.write(data);
			bufferedWriter.flush();
			status = 0;
		}
		catch(IOException ioException) {
			status = -2;
			ioException.printStackTrace();
		}
		finally {
			if(null!=bufferedWriter) {
				try {
					bufferedWriter.close();
				}
				catch(IOException ioException) {
					ioException.printStackTrace();
				}
			}
			if(null!=fileWriter) {
				try {
					fileWriter.close();
				}
				catch(IOException ioException) {
					ioException.printStackTrace();
				}
			}
		}
		return status;
	}
	
	public Customer getCustomer(int customerId) {
		Customer customer = null;
		
		FileReader fileReader = null;
		BufferedReader bufferReader = null;
		
		try {
			fileReader = new FileReader(file);
			bufferReader = new BufferedReader(fileReader);
			String[] data = null;
			String input = bufferReader.readLine();
			while(input != null) {
				data = input.split(":");
				
				if(Integer.parseInt(data[0]) == customerId) {
					customer = new Customer();
					
					customer.setCustomerId(Integer.parseInt(data[0]));
					customer.setCustomerName(data[1]);
					break;
				}
				
				input = bufferReader.readLine();
			}
		} 
		catch(IOException ioException) {
			ioException.printStackTrace();
		}
		finally {
			if(null!=bufferReader) {
				try {
					bufferReader.close();
				}
				catch(IOException ioException) {
					ioException.printStackTrace();
				}
				
			}
			if(null!=fileReader) {
				try {
					fileReader.close();
				}
				catch(IOException ioException) {
					ioException.printStackTrace();
				}
				
			}
		}
		return customer;
	}
}
