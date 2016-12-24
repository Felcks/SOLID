package ocp;

import java.util.List;

public class DrawShapes 
{
	//----------------------RIGHT WAY---------------------------
	private void DrawAllShapes(List<Shape> shapes)
	{
		for(int i = 0; i < shapes.size(); i++){
			shapes.get(i).Draw();
		}
	}
	
	//----------------------WRONG WAY--------------------------
	/*(private void DrawAllShapes(List<Shape> shapes)
	{
		for(int i = 0; i < shapes.size(); i++){
			if(shapes.get(i).getClass().toString() == "Circle")
				shapes.get(i).DrawCircle();
			else if(shapes.get(i).getClass().toString() == "Square")
				shapes.get(i).DrawSquare();
		}
	}*/
}
