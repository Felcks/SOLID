package isp;

/*
 * CLIENTS SHOULD NOT BE FORCED TO DEPEND UPON INTERFACES THAT THEY DO NOT USE
 */

//REMEMBER: THE POLYAD VS THE MONAD. PREFER POLYAD.

public class InterfaceSegregationPrinciple 
{
	//------------------------------------------------WRONG WAY-----------------------------------------------------
	//CheckingAccount and SavingsAccount extends Account with the 3 methods(Transfer, withdraw and deposite)
	//but SavingsAccount overrides the first two and for an empty.
	//This is bad because with we change Account name or remove SavingsAccount will be affected withoud use this methods at all.
	/*public void doActions(Account account)
	{
		account.deposite();
		account.withdraw();
	}
	*/
	
	//------------------------------------------------RIGHT WAY-----------------------------------------------------
	public void doActions(CheckingAccount account)
	{
		account.withdraw();
	}
}
