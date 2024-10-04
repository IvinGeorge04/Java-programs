package Tutorial;

public class InvalidNumberException extends Exception{
	private String message;
	public InvalidNumberException(String msg) {
		message=msg;
	}
	public String getMessage(){
		return message;
	}
}
