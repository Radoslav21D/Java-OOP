package Painting;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class car extends JPanel implements Runnable {
	public car() {
	}

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	public static int xcar = 25, xlights = 115;
	public static int xwheel1 = 10;
	public static int xwheel2 = 140;
	public boolean there = false;

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Car driving");
		frame.getContentPane().add(new car());
		frame.setSize(850, 300);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

	}

	public void paint(Graphics g) {

		super.paint(g);

		// contentPane.paint(g);

		Graphics2D h = (Graphics2D) g;
		((Graphics2D) g).setStroke(new BasicStroke(6));

		g.drawOval(xwheel1, 220, 35, 35);
		g.drawOval(xwheel2, 220, 35, 35);
		g.drawRect(xcar, 145, 140, 65);
		g.fillRect(1, 255, 1000, 30);
		g.setColor(Color.YELLOW);
		g.fillRect(xlights, 170, 45, 20);

		if (xcar <= 700 && there == false) {

			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			xcar += 1;
			xwheel1 += 1;
			xwheel2 += 1;
			xlights += 1;
			repaint();
		}
		if (xcar == 700) {
			there = true;
			xlights = 705;
		}
		if (xcar >= 10 && there == true) {
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			xcar -= 1;
			xwheel1 -= 1;
			xwheel2 -= 1;
			xlights -= 1;
			repaint();
		}

		if (xcar == 10) {
			there = false;

			xlights = 100;
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
