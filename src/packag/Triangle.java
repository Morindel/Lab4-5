package packag;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

import javax.swing.JPanel;

public class Triangle extends packag.Polygon {


	private Point p1 , p2 ,p3 ;
	private double a, b, c;
	private Polygon poly ;
	JPanel jpanel = new JPanel ();
	private int nr;

	
	
	private void Set()
	{
		try
		{
		Check();
		a = p1.distance(p2);
		b = p1.distance(p3);
		c = p2.distance(p3);
		if (a+b <= c || a + c <= b || b + c <= a)
			throw new IllegalArgumentException("Punkty nie spelniaja warunku trojkata");
		}
		catch (IllegalArgumentException e)
		{
			System.err.println(e.getMessage());
		}
	}
	private void Check()
	{
		if ( p1.getX() == p2.getX() && p2.getX() == p3.getX() )
			throw new IllegalArgumentException("Nie mozna utworzyc trojkata z 3 punktow w tej samej lini X");
		if ( p1.getY() == p2.getY() && p2.getY() == p3.getY()  )
				throw new IllegalArgumentException("Nie mozna utworzyc trojkata z 3 punktow w tej samej lini Y");
	
	}
	
	public void setP1(double x, double y)
	{
		this.p1.setX(x);
		this.p1.setY(y);
		Set();
	}
	public void setP1(Point p)
	{
		this.p1.setX(p.getX());
		this.p1.setY(p.getY());
		Set();
	}
	
	public void setP2(double x, double y)
	{
		this.p2.setX(x);
		this.p2.setY(y);
		Set();
		
	}
	public void setP2(Point p)
	{
		this.p2.setX(p.getX());
		this.p2.setY(p.getY());
		Set();
	}
	public void setP3(double x, double y)
	{
		this.p3.setX(x);
		this.p3.setY(y);
		Set();
	}
	public void setP3(Point p)
	{
		this.p3.setX(p.getX());
		this.p3.setY(p.getY());
		Set();
	}
	
	public Triangle(Point p1, Point p2, Point p3,Color c)
	{
		this.p1 = new Point(p1);
		this.p2 = new Point(p2);
		this.p3 = new Point(p3);
		Set();
		this.figureColor = c;
		//FigureComponent.polygon.add(this);
		this.nr = packag.Polygon.numb;
		
	}
	public  int getNr()
	{
		return nr;
	}
	

//	public double Height(Point p){
//		final double height;
//		
//		
//		if(p1.getX() == p.getX() && p1.getY() == p.getY())
//			height =  ((2*this.Heron())/b);
//		else if(p2.getX() == p.getX() && p2.getY() == p.getY())
//			height =  ((2*this.Heron())/c);
//		else if(p3.getX() == p.getX() && p3.getY() == p.getY())
//			height =  ((2*this.Heron())/a);
//		else 
//			throw new IllegalArgumentException("Nie istnieje taki punkt w trojkacie");
//		
//		return height;	
//	}
	@Override
	public String toString() {
		return "Number " + this.getNr() + " Area " + this.countArea() + " Perimeter " +  this.countPerimeter() + " ";
	}

	@Override
	public	Double countArea() {
	
		final Double area;
		area = (Math.sqrt((a+b+c)*(a+b-c)*(a-b+c)*(-a+b+c))/4);
		return area;
		
	}
	@Override
	public void drawFigure(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
	   	jpanel.paintComponents(g2D);
        g2D.setColor (super.figureColor);
        int [] xList = {(int) this.p1.getX(), (int) this.p2.getX(), (int) this.p3.getX()};
            
        int [] yList = {(int) this.p1.getY(), (int) this.p2.getY(), (int) this.p3.getY()};
        
        
        poly = new Polygon (xList, yList, 3);
        g2D.fillPolygon (poly);
        
        }
	@Override
	public double countPerimeter() {
		final double perimeter;
		perimeter = a + b +c ;
		return perimeter;
	}
	
}
