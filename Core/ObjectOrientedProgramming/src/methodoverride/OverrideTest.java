package methodoverride;

public class OverrideTest {

	public static void main(String[] args) {
		
		// Creating Vehicle object.
		Vehicle vehicle = new Vehicle();
		vehicle.start();
		vehicle.accelerate(80);
		vehicle.stop();
		
		// Creating Car object.
		Car car = new Car();
		car.start();
		car.accelerate(100);
		car.stop();

	}

}
