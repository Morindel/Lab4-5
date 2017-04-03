package packag;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class FirstJFrame extends JFrame  {
	public void set(){
		Toolkit kit= Toolkit.getDefaultToolkit();
		Dimension size=kit.getScreenSize();
		final int x = size.width;
		final int y = size.height;
	
		setLayout(new FlowLayout());
		setLocation(x/4, y/4);
		setSize(x/2,y/2);	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	
		JPanel jpanel = new FigureComponent(x/2,y/2);
		add(jpanel);
		FigureComponent.Presentation();
		}
	public FirstJFrame() {
		super("LAB4");
	}
	public static void main(String [] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
	
	@Override
	public void run() {
		new FirstJFrame().set();
	}
});
		

	}	
}
