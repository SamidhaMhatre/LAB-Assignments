package Lab5Exercise1;

public class AgeException extends Exception {
	private String message;

	public AgeException() {

	}

	public AgeException(String message) {
		this.message=message;
	}
	
	public String getMessage() {
		return this.message;
	}


}