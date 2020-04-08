package encapsulation;

public class Vehicle {
	
	private String model;
	private int maxSpeed;
	
	public Vehicle (String model, int maxSpeed) {
		this.model = model;
		this.maxSpeed = maxSpeed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	

}
