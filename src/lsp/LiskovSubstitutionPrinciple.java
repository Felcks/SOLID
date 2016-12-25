package lsp;

import java.util.List;

/*
 * FUNCTIONS THAT MADE POINTERS OR REFERENCES TO BASE CLASSES MUST 
 * BE ABLE TO USE OBJECTS OF DERIVED CLASSES WITHOUT KNOWING IT.
 */
public class LiskovSubstitutionPrinciple 
{
	//---------------------------WRONG WAY--------------------------
	//Supposing that Square extends Rectangle, an error would ocurr in that program.
	//We would have a Square with different sizes.
	/*
		public void definingAndPrintAreas(List<Rectangle> rectangles)
		{
			for(int i = 0; i < rectangles.size(); i++)
			{
				rectangles.get(i).setWidth(10);
				rectangles.get(i).setHeight(5);
				System.out.println(rectangles.get(i).width * rectangles.get(i).height);
			}
			
			// Ps. Class Square Extends Rectangle and Gemoetric does not exist!
		}
	*/
	
	//---------------------------RIGHT WAY--------------------------
	//All gona be fine, because Square and Rectangles extends Geometric
	public void definingAndPrintAreas(List<Rectangle> rectangles)
	{
		for(int i = 0; i < rectangles.size(); i++)
		{
			rectangles.get(i).setWidth(10);
			rectangles.get(i).setHeight(5);
			System.out.println(rectangles.get(i).width * rectangles.get(i).height);
		}
	}
}
