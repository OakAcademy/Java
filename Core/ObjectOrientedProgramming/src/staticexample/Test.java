package staticexample;

public class Test {

	public static void main(String[] args) {
		
		Car.speedUp(60);
		Car.speedUp(160);
		Car.speedDown(50);
		Car.stop();
		
		Car obj = new Car();
		obj.speedUp(40);

	}

}
