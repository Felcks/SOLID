package srp;

import java.util.ArrayList;
import java.util.List;

public class ClientManager
{
	private List<Client> allCustomers;
		
	public ClientManager()
	{
		this.allCustomers = new ArrayList<Client>();
	}
	
	public void addClient(Client client)
	{
		if(!client.isValid())
			return;
		
		this.allCustomers.add(client);
	}
}
