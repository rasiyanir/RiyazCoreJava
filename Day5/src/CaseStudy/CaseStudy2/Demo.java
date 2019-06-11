package CaseStudy.CaseStudy2;

class Travel {
	private char modeOfTravel;
	private int noOfTickets;
	private double amount;
	public char getModeOfTravel() {
		return modeOfTravel;
	}
	public void setModeOfTravel(char modeOfTravel) {
		this.modeOfTravel = modeOfTravel;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}

public class Demo {
	public static void main(String[] args) {
		Travel travel = new Travel();
		travel.setModeOfTravel('T');
		travel.setNoOfTickets(3);
		
		if(travel.getModeOfTravel() == 'F'){
			int serviceCharge = 500;
			travel.setAmount(serviceCharge*travel.getNoOfTickets()); 
			System.out.println("Amount: $" + travel.getAmount());
		}
		else if(travel.getModeOfTravel() == 'T'){
			int serviceCharge = 100;
			travel.setAmount(serviceCharge*travel.getNoOfTickets());
			System.out.println("Amount: $" + travel.getAmount());
		}
		else if(travel.getModeOfTravel() == 'B'){
			int serviceCharge = 50;
			travel.setAmount(serviceCharge*travel.getNoOfTickets());
			System.out.println("Amount: $" + travel.getAmount());
		}
	}
}
