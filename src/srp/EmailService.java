package srp;

public class EmailService 
{
	public static Boolean isValid(String email){
		if(email.contains("@"))
			return true;
		
		return false;
	}
}
