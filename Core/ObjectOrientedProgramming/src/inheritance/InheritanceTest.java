package inheritance;

public class InheritanceTest {

	public static void main(String[] args) {
		
		// Creating Car object.
		Car car = new Car ();
		car.type = "Car";
		car.model = "Ferrari";
		car.maxSpeed = 320;
		car.print();
		
		// Creating Motorcycle object.
		Motorcycle motor = new Motorcycle();
		motor.type = "Motorcycle";
		motor.model = "Kawasaki";
		motor.maxSpeed = 180;
		motor.print();

	}

}
