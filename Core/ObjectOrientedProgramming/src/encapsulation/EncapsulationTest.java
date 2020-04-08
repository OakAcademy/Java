package encapsulation;

public class EncapsulationTest {

	public static void main(String[] args) {
		
		// Creating Car object.
		Car car = new Car("Ferrari", 320, true);
		System.out.println("Model : " + car.getModel());
		System.out.println("Max Speed : " + car.getMaxSpeed());
		System.out.println("Is automatic ? : " + car.isAutomatic());

	}

}
