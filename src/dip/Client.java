package dip;

import dip.ICPFService;
import dip.IEmailService;

class Client 
{
	private String nome;
	private String CPF;
	private String email;
	
	private IEmailService _emailService;
	private ICPFService _cpfService;
	
	public Client(String nome, String CPF, String email, IEmailService emailService, ICPFService cpfService)
	{
		this.nome = nome;
		this.CPF = CPF;
		this.email = email;
		this._emailService = emailService;
		this._cpfService = cpfService;
	}
	

	public Boolean isValid(){
		if(_emailService.isValid(this.getEmail()) && _cpfService.isValid(this.getCPF()))
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
