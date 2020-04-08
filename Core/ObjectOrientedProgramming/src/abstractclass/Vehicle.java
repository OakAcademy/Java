package abstractclass;

public abstract class Vehicle {
	
	String type, model;
	
	// constructor
	public Vehicle (String type, String model) {
		this.type = type;
		this.model = model;
	}
	
	// non-abstract method
	public void start () {
		System.out.println("Vehicle has started.");
	}
	
	// non-abstract method
	public void stop () {
		System.out.println("Vehicle has stopped.");
	}
	
	// abstract method
	public abstract int getMaxSpeed();

}
