package packag;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class FigureComponent extends JPanel{

	public static List <Polygon> polygon = new ArrayList<>();
	
	
		private Figure t1 = new Triangle( new Point(100,200),new Point(0,0),new Point(500,400),Color.GREEN);
		private Figure t2 = new Triangle( new Point(800,200), new Point(300,120), new Point(700,450),Color.RED);
		private Figure q1 = new  Quadrangle ( new Point(0,0),  new Point(200,0), new Point(200,200),new Point(0,200),Color.BLUE);
		private Figure q2 = new Quadrangle(new Point(730,300),new Point(540,300), new Point(230,500) ,new Point(300,490),Color.CYAN);
		private static Figure c1 = new Circle(700, 300, 300);
		public static Figure [] t = {c1};
		public static void Presentation()
		{
			for (Polygon p : polygon)
			{
				System.out.println(p);
				System.out.println("Number of polygons " + (polygon.indexOf(p)+1) );
			}
			
			System.out.println("Table of figures that aren't polygons : ");
			for (Figure f : t)
			{
				System.out.println(f);
			}
		}
		public FigureComponent(int x,int y)
		{
			setPreferredSize(new Dimension(x,y));
		}
		public void paintComponent(Graphics g)

		{
			super.paintComponents(g);
			Graphics2D g2 = (Graphics2D) g;
			
				for (Polygon p : polygon)
				{
//					System.out.println(p);
					p.setColor(Color.GREEN);
					p.drawFigure(g2);
					
				}
			for(Figure f : t)
			{
				
				f.drawFigure(g2);
				
			}
		}
	}

