package textBook;


import java.awt.*;

import javax.swing.JApplet;

@SuppressWarnings("deprecation")
public class OlympicRings extends JApplet {
	
	public void paint(Graphics g) {
		int cW = 60, wW = 40, s = 5;
		
		// blue, hopefully
		g.setColor(Color.BLUE);
		g.fillOval(s, s, cW, cW);
		g.setColor(Color.WHITE);
		g.fillOval(s + 10, s + 10, wW, wW);
		
		// black?
		g.setColor(Color.BLACK);
		g.fillOval(s + cW + 10, s, cW, cW);
		g.setColor(Color.WHITE);
		g.fillOval(s + 20 + cW, s + 10, wW, wW);
		
		//red
		g.setColor(Color.RED);
		g.fillOval(s + (cW*2) + 20, s, cW, cW);
		g.setColor(Color.WHITE);
		g.fillOval(s + 30 + cW*2, s + 10, wW, wW);
		
		//Yellow
		g.setColor(Color.YELLOW);
		g.fillOval(s + cW/2 + 5, s + cW/2, cW, cW);
		g.setColor(Color.WHITE);
		g.fillOval(s + 15 + cW/2, s + 10 + cW/2, wW, wW);
		
		//Green
		g.setColor(Color.GREEN);
		g.fillOval(s + cW + 45, s + cW/2, cW, cW);
		g.setColor(Color.WHITE);
		g.fillOval(s + 55 + cW, s + cW/2 + 10, wW, wW);
		
	}

}