package bankaccount;

public class InSufficientFundException extends Exception{
	
	private String message;
	
	// Constructor
	public InSufficientFundException (String message) {
		this.message = message;
	}

	// getter method of message
	public String getMessage() {
		return message;
	}
	
	

}
