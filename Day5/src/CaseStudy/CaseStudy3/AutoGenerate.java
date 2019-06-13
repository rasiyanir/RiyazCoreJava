package CaseStudy.CaseStudy3;

import java.util.Random;
import java.util.Scanner;



class Travel{
	public static int bookingCode;
	
	
	
	public static int companyCode = 115;
	public char modeOfTravel;
	public int rideCode;
	
	public Travel(){
		++bookingCode;
	}
	
	public static int getBookingCode() {
		return bookingCode;
	}

	public static void setBookingCode(int bookingCode) {
		Travel.bookingCode = bookingCode;
	}
	public char getModeOfTravel() {
		return modeOfTravel;
	}
	public void setModeOfTravel(char modeOfTravel) {
		this.modeOfTravel = modeOfTravel;
	}
	public int getRideCode() {
		return rideCode;
	}
	public void setRideCode(int rideCode) {
		this.rideCode = rideCode;
	}
	
}

public class AutoGenerate {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		
		
		
		System.out.println("Booking 1. Yes 2. No");
		
		int booking = sc.nextInt();
		
		while(booking != 2){
			Travel travel = new Travel();
			System.out.println("Enter the Travel Mode:");
			travel.setModeOfTravel(sc.next().charAt(0));
			if(travel.getModeOfTravel() == 'F'){
				travel.setRideCode(101 + r.nextInt(5));
			}
			else if(travel.getModeOfTravel() == 'T'){
				travel.setRideCode(201 + r.nextInt(5));
			}
			if(travel.getModeOfTravel() == 'B'){
				travel.setRideCode(301 + r.nextInt(5));
			}
			
			if(Travel.companyCode == 115 
					&& travel.getModeOfTravel() == 'F' 
					&& (travel.getRideCode() >= 101 
					&& travel.getRideCode() <= 105) 
					&& Travel.bookingCode >= 0001){
					System.out.println("Booking Number: " + Travel.companyCode + "" + travel.getModeOfTravel() + "" + travel.getRideCode() + "" + String.format("%04d", Travel.bookingCode));
				}
				else if(Travel.companyCode == 115 
						&& travel.getModeOfTravel() == 'T' 
						&& (travel.getRideCode() >= 201 
						&& travel.getRideCode() <= 205) 
						&& Travel.bookingCode >= 0001){
					System.out.println(Travel.companyCode + "" + travel.getModeOfTravel() + "" + travel.getRideCode() + "" + String.format("%04d", Travel.bookingCode));
				}
				else if(Travel.companyCode == 115 
						&& travel.getModeOfTravel() == 'B' 
						&& (travel.getRideCode() >= 301 
						&& travel.getRideCode() <= 305) 
						&& Travel.bookingCode >= 0001){
					System.out.println(Travel.companyCode + "" + travel.getModeOfTravel() + "" + travel.getRideCode() + "" + String.format("%04d", Travel.bookingCode));
				}
				else{
					System.out.println("Error");
				}
			
			System.out.println("Booking 1. Yes 2. No");
			
			booking = sc.nextInt();
			
		}
		
		System.out.println("Thanks, come again.");
		
		
		
		
		
		
		
		
	}
}
