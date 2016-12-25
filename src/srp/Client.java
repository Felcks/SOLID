package srp;

class Client 
{
	private String nome;
	private String CPF;
	private String email;
	
	public Client(String nome, String CPF, String email)
	{
		this.nome = nome;
		this.CPF = CPF;
		this.email = email;
	}
	

	public Boolean isValid(){
		if(EmailService.isValid(this.getEmail()) && CPFService.isValid(this.getCPF()))
			return true;
		
		return false;
	}
	
	public String getCPF(){
		return this.CPF;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getEmail(){
		return this.email;
	}
}
