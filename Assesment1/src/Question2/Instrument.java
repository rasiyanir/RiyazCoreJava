package Question2;

public class Instrument {
	private String name;
	public String[] sound;
	
	public void playSound() {
		System.out.println("Playing Instrument");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
