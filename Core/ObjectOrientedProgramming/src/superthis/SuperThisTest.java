package superthis;

public class SuperThisTest {

	public static void main(String[] args) {
		
		// Creating Car object
		
		Car car = new Car("Car", "Ferrari", 320, true);
		System.out.println("Type : " + car.getType());
		System.out.println("Model : " + car.getModel());
		System.out.println("Max Speed : " + car.getMaxSpeed());
		System.out.println("Is Car automatic ? " + car.isAutomatic());

	}

}
