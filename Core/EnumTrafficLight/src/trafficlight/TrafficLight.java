package trafficlight;

public enum TrafficLight {
	
	RED ("Stop"),
	YELLOW ("Wait"),
	GREEN ("Go") ;
	
	private String action;
	
	// constructor
	private TrafficLight (String action) {
		this.action = action;
	}

	// getter method of action
	public String getAction() {
		return action;
	}
	
	

}
