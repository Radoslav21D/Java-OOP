package target;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics2D;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class target extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldPole;
	private JTextField textField_1Ots;
	private JTextField textField_2Diam;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					target frame = new target();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public target() {
		setTitle("Target");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 554);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBounds(12, 13, 307, 481);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textFieldPole = new JTextField();
		textFieldPole.setBounds(157, 27, 116, 22);
		panel.add(textFieldPole);
		textFieldPole.setColumns(10);
		
		textField_1Ots = new JTextField();
		textField_1Ots.setBounds(157, 62, 116, 22);
		panel.add(textField_1Ots);
		textField_1Ots.setColumns(10);
		
		textField_2Diam = new JTextField();
		textField_2Diam.setBounds(157, 96, 116, 22);
		panel.add(textField_2Diam);
		textField_2Diam.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u041F\u043E\u043B\u0435");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(12, 29, 56, 16);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u041E\u0442\u0441\u0442\u043E\u044F\u043D\u0438\u0435");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(12, 64, 86, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u041C\u0438\u043D. \u0434\u0438\u0430\u043C\u0435\u0442\u044A\u0440");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(12, 99, 116, 16);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(12, 431, 97, 25);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");JPanel panel_1 = new JPanel();
panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(320, 13, 363, 481);
		contentPane.add(panel_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_1.repaint();
			}
		});
		
		btnNewButton_1.setBounds(12, 393, 97, 25);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Draw");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			Graphics2D g=(Graphics2D) panel_1.getGraphics();
			int pole=Integer.valueOf(textFieldPole.getText());
			int minDiam=Integer.valueOf(textField_2Diam.getText());
			int ots=Integer.valueOf(textField_1Ots.getText());
			int diam=minDiam+pole*ots;
			int i=pole;
			int x=(panel_1.getWidth()/2)-diam/2,y=(panel_1.getHeight()/2)-diam/2;
			for(boolean b=true;i>=0;b= !b,i--) {
				g.setColor(b? Color.green:Color.blue);
				g.fillOval(x, y, diam, diam);
				diam-=ots;
				x+=ots/2;
				y+=ots/2;
			}
			}
		});
		btnNewButton_2.setBounds(12, 355, 97, 25);
		panel.add(btnNewButton_2);
	}
}

