package staticexample;

public class Car {
	
	public static int currentSpeed = 0;
	public static int maxSpeed = 180;
	
	public static void showCurrentSpeed (int speed) {
		System.out.println("Your current speed is : " + currentSpeed);
	}
	public static void speedUp (int increase) {
		currentSpeed +=increase;
		if (currentSpeed > maxSpeed) {
			showCurrentSpeed(currentSpeed);
			System.out.println("Please slow down!");
		}
		else {
			showCurrentSpeed(currentSpeed);
		}
	}
	public static void speedDown (int decrease) {
		currentSpeed -=decrease;
		showCurrentSpeed(currentSpeed);
	}
	public static void stop () {
		currentSpeed = 0;
		showCurrentSpeed(currentSpeed);
	}

}
