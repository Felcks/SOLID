package srp;

class EmailService 
{
	public static Boolean isValid(String email){
		if(email.contains("@"))
			return true;
		
		return false;
	}
}
