package ocp;

public abstract class Shape 
{
	public abstract void Draw();
	
	private static String[] tableOrder = { "Circle", "Square" };
	public static String[] getTableOrder(){
		return tableOrder;
	}
}
