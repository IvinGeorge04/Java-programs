package Tutorial;

public class InvalidScoreException extends Exception {
	private String message;
	InvalidScoreException(String msg){
		message=msg;
	}
	public String getMessage(){
		return message;
	}
}
