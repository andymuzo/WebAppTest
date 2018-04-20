package webapp.com.inharmonic;

public class UserValidationService {
	
	public boolean isUserValid(String user, String password) {
		if (user.equals("Andy") && password.equals("password")) return true;
		else return false;
	}
}
