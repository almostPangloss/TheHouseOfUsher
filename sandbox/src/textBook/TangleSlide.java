package textBook;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JApplet;

public class TangleSlide extends JApplet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint ( Graphics g ){
		System.out.println("Paint has been called.");
		
		super.paint(g);
		
		int rectWidth = 12;
		int rectHeight = 6;
		Color COLOR = Color.CYAN;
		
		int winWidth = getWidth();
		int winHeight = getHeight();
		
		int x = (winWidth - rectWidth);
		int y = ((winHeight / 2) - (rectHeight / 2));
		
		//Rectangle rect = new Rectangle ( x, y, rectWidth, rectHeight);
		
		g.setColor(COLOR);
		
		while ( x > 0 ){
			
			g.drawRect(x, y, rectWidth, rectHeight);
			
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			g.clearRect(0, 0, getWidth(), getHeight());
			
			x -= 2;
		}
		
		g.drawRect(x, y, rectWidth, rectHeight);
	}

}
