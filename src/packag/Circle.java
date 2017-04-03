package packag;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Circle implements Figure{
	private JPanel jpanel = new JPanel ();
	private int  x , y, r; 
	public  Circle(int x,int y , int r) {
		this.x = x; 
		this.y = y;
		this.r = r;
	}
	@Override
	public void drawFigure(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
	   	jpanel.paintComponents(g2D);
	   	
		 x = x-(r/2);
		  y = y-(r/2);
		  g2D.setColor(Color.BLUE);
		  g2D.fillOval(x,y,r,r);
		
		
	}
	public Double Area()
	{
		return Math.PI * this.r * this.r ;
	}
	public Double Perimeter()
	{
		return 2*Math.PI * r;
	}
	@Override

	public String toString() {
		return " Area " + this.Area() + " Perimeter " +  this.Perimeter() + " ";
	}

	
}
