package srp;

class CPFService 
{
	public static Boolean isValid(String CPF){
		if(CPF.length() == 11)
			return true;
		
		return false;
	}
}
