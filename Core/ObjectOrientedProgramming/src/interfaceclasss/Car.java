package interfaceclasss;

public class Car implements Drivable {

	@Override
	public void turnLeft() {
		System.out.println("Car can turn left");
	}

	@Override
	public void turnRight() {
		System.out.println("Car can turn right");
	}

}
