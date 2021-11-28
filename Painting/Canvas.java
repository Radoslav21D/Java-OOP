package Painting;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Canvas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setTitle("Lines");
		frame.setSize(500,300);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(new Color(248, 252, 154));
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBounds(10,10,200,240);
		panel.setBackground(new Color(255, 234, 38));
		panel.setLayout(null);
		
		JLabel label = new JLabel("Intervals: ");
		label.setBounds(5,0,70,20);
		panel.add(label);
		
		JTextField tf = new JTextField();
		tf.setBounds(75,5,90,20);
		panel.add(tf);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(215,10,240,240);
		panel1.setBackground(new Color(255, 208, 0));
		panel1.setLayout(null);
		frame.add(panel1);
		
		JButton btn = new JButton("Draw");
		btn.setBounds(5,200,90,30);
		btn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int n = Integer.parseInt(tf.getText());
				Graphics g = panel1.getGraphics();
				g.setColor(new Color(255, 208, 0));
				g.fillRect(0, 0, 240, 240);
				g.setColor(Color.BLACK);
				int curx = 0,cury=frame.getHeight()-60;
				for (int i = n;i>0;i--){
					curx+=panel1.getWidth()/n;
					cury-=panel1.getWidth()/n;
					g.drawLine(0, 0, curx, cury);
					g.drawLine(curx, cury, panel1.getWidth(), panel1.getHeight());
				}
			}
			
		});
		panel.add(btn);
		
		JButton btn1 = new JButton("Out");
		btn1.setBounds(100,200,90,30);
		btn1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
			
		});
		panel.add(btn1);
		
		frame.add(panel);
		frame.setVisible(true);
	}

}
