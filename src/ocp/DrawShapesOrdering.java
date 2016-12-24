package ocp;

import java.util.List;

public class DrawShapesOrdering 
{
	//----------------------RIGHT WAY---------------------------
	private void DrawAllShapes(List<Shape> shapes)
	{
		for(int j = 0; j < Shape.getTableOrder().length; j++)
		{
			for(int i = 0; i < shapes.size(); i++)
			{
				if(shapes.get(i).getClass().getName() == Shape.getTableOrder()[j])
					shapes.get(i).Draw();
			}
		}
	}
}
