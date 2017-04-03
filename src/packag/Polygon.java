package packag;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Polygon implements Figure {
	public static int numb = 0;
	protected Color figureColor ;
	public Polygon()
	{
		numb ++;
		FigureComponent.polygon.add(this);
	}
	
	public void setColor(Color c){
		this.figureColor = c ;
	};
	abstract int getNr();
	abstract double countPerimeter();
	abstract Double countArea();
	//abstract void drawPolygon(Graphics g);

	

	}
