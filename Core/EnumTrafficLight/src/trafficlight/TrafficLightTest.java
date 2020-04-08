package trafficlight;

public class TrafficLightTest {

	public static void main(String[] args) {
		
		TrafficLight [] lights = TrafficLight.values();
		// for-each loop starts to access Enum elements
		for (TrafficLight light : lights) {
			System.out.println("Light : " + light.toString()
							+ " Action : " + light.getAction());
		}

	}

}
