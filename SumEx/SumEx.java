package SumEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SumEx extends JFrame {
	
	JTextField textField1,textField2,rez;
	JLabel l;
	int value1=0,value2=0,sum=0;
	SumEx() {
		
		setLayout(new FlowLayout());
		textField1 = new JTextField(5);
		textField2 = new JTextField(5);
		textField1.addActionListener(new Enter());
		textField2.addActionListener(new Enter());
		l = new JLabel("Type a number in each box!");
		add(l);
		rez = new JTextField(18);
		add(textField1);
		add(textField2);
		add(rez);
		textField1.setText("0");
		textField2.setText("0");
		setSize(230,150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	class Enter implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String rz="";
			try {
				value1 = Integer.parseInt(textField1.getText());
				value2 = Integer.parseInt(textField2.getText());
				rz = value1+value2+""; }
				catch(NumberFormatException ex) {
					rz="integer in each box please!";
				}
			catch(ArithmeticException ex) {
				rz="Не е възможно деление на 0!";
			}
			finally {
				rez.setText(rz);
			}
		
	}
		
	public void main(String[] args) {
		// TODO Auto-generated method stub
			new SumEx();
	}
		}}
