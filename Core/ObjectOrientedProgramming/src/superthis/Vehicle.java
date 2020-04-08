package superthis;

public class Vehicle {
	
	String type, model;
	int maxSpeed;
	
	// constructor
	public Vehicle (String type, String model, int maxSpeed) {
		this.type = type;
		this.model = model;
		this.maxSpeed = maxSpeed;
	}

	// getter methods
	public String getType() {
		return type;
	}

	public String getModel() {
		return model;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}
	

}
