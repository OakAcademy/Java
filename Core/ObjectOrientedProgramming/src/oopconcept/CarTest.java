package oopconcept;

public class CarTest {

	public static void main(String[] args) {
		
		Car myCar = new Car("Ferrari");
		myCar.start();
		myCar.accelerate();
		myCar.showSpeed();
		myCar.stop();
		myCar.showSpeed();
		
		Car myCar1 = new Car("Ferrari", "Red", 2015);
		System.out.println(myCar1); // calls toString() method in Car.

	}

}
