package srp;

import java.util.ArrayList;
import java.util.List;

public class ClientManager_Wrong 
{
	private List<Client> allCustomers;
		
	public ClientManager_Wrong()
	{
		this.allCustomers = new ArrayList<Client>();
	}
	
	public void addClient(Client client)
	{
		if(client.getCPF().length() != 11)
			return;
		
		if(!client.getEmail().contains("@"))
			return;
		
		this.allCustomers.add(client);
	}
}
