

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;

import javax.swing.JFrame;

public class Function {
	
	GraphicsConfiguration gc;
	
	public Function() {
		
	}
	
	public double of(double x) {
		return 0;
	}
	
	public void graph() {
		JFrame graph = new JFrame(gc) {
			@Override
			public void paint(Graphics g) {
				super.paint(g);
				g.drawLine(250, -500, 250, 500);
				g.drawLine(-500, 250, 500, 250);
				g.setColor(Color.BLUE);
				for (int i = -500; i < 500; i++) {
					g.drawLine(i + 250, -(int)of(i) + 250, i + 251, -(int)of(i + 1) + 250);
				}
			}
		};
		graph.setTitle("Graph");
		graph.setSize(500, 500);
		graph.setVisible(true);
		graph.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		graph.setResizable(false);
	}
}
