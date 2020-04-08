package polymorphism;

public class Test {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Car ();
		// this works because Car is a subclass of Vehicle.
		vehicle.accelerate();
		
		Vehicle vehicle1 = new Motorcycle();
		vehicle1.accelerate();

	}

}
