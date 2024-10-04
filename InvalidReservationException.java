package Tutorial;

public class InvalidReservationException extends Exception {
	private String message;
	public InvalidReservationException(String msg) {
		message=msg;
	}
	public String getMessage(){
		return message;
	}

}
